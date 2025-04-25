--subquery : 특정 sqp 문 안에 또 다른 sql 문이 포함되어 있는 것
--서브쿼리를 통해 DB 접속 횟수를 줄여 효율적인 쿼리문을 작성 가능

--서브쿼리를 사용할 수 있는 조건
--1) where, having 절의 다음
--2) select, delete 문의 from 절의 다음
--3) update 문의 set 절의 다음
--4) insert 문의 into 절의 다음

--이름이 Michael 이고 직종이 mk_man인 사원의 급여보다
--많이 받는 사원들의 정보를 사번, 이름, 직종, 급여 순으로 출력

select employee_id, first_name, job_id, salary
from EMPLOYEES
where salary > (select salary from EMPLOYEES
where first_name = 'Michael' and job_id = 'MK_MAN');

--사번이 111번인 사원의 직종과 같고
--사번이 159번인 사원의 급여보다 많이 받는 사원들의 정보를
--사번, 이름, 직종, 입사일, 급여 순으로 출력

select employee_id, first_name, job_id, hire_date, salary from EMPLOYEES
where job_id = (select job_id from EMPLOYEES where employee_id = 111)
      and salary > (select salary from EMPLOYEES where employee_id = 159);

--가장 월급을 많이 받는 사원의 사번, 이름, 급여를 출력
select employee_id "사번", first_name "이름", salary "급여" from EMPLOYEES
where salary = (select max(salary) from EMPLOYEES);

--급여의 평균이 5000 이상인 부서의 인원수를 내림차순으로 출력
select department_id, count(*) "인원수"
from EMPLOYEES
where department_id is not null
having avg(salary) >= 5000
group by department_id
order by "인원수" desc;

--다중 행 서브쿼리 : 여러 개의 행을 반환하는 쿼리문을 서브로 돌려야 하는 경우
--급여의 평균이 5000 이상인 부서의 인원수를 내림차순으로 출력
select department_id, count(*) "인원수"
from EMPLOYEES
having department_id in (select department_id from EMPLOYEES 
						 having avg(salary) >= 5000 and department_id is not null 
						 group by department_id)
group by department_id
order by "인원수" desc;

--사번이 150번인 사원과 같은 월급을 받는 사원들의
--이름, 급여 순으로 출력

select first_name "이름", salary "급여" from EMPLOYEES
where salary = (select salary from EMPLOYEES where employee_id = 150);

--회사 평균 월급 이상인 사람들의 이름, 급여 출력
select first_name, salary from EMPLOYEES
where salary >= (select avg(salary) from EMPLOYEES)
order by salary desc;

--Bruce와 같은 부서에서 근무하는 사원들의 이름을 출력
select first_name from EMPLOYEES
where department_id = (select department_id from EMPLOYEES where first_name = 'Bruce')
order by first_name;

--월급이 137번 사원 이상 149번 이하인 사원들의 이름, 월급 출력
select first_name, salary from EMPLOYEES
where salary
between
	(select salary from EMPLOYEES where employee_id = 137)
	and
	(select salary from EMPLOYEES where employee_id = 149);

--직종별 평균 급여를 출력
--평균 급여가 Bruce의 월급보다 큰 직종만 출력
select job_id "직종", 
	   round(avg(salary)) "평균 급여"
from EMPLOYEES
having round(avg(salary)) > (select round(avg(salary)) 
							 from EMPLOYEES where first_name = 'Bruce')
group by job_id order by "평균 급여";

--성이 Kochhar인 직원의 급여를 초과하는 사원의 사번, 성, 직종, 급여를 출력
select
	employee_id "사번",
	last_name "성",
	job_id "직종",
	salary "급여"
from EMPLOYEES
where salary > (select salary from EMPLOYEES where last_name = 'Kochhar');

--회사에서 가장 작은 월급을 받는 사원의 사번, 이름, 성, 급여를 출력
select
	employee_id "사번",
	first_name "이름",
	last_name "성",
	salary "급여"
from EMPLOYEES
where salary = (select min(salary) from EMPLOYEES);

--사번이 158번인 사원과 같은 직종이면서 월급이 164번 사원을 초과하는 사원들의
--사번, 이름, 성, 직종, 급여를 출력
select
	employee_id "사번",
	first_name "이름",
	last_name "성",
	job_id "직종",
	salary "급여"
from EMPLOYEES
where
	job_id = (select job_id from EMPLOYEES where employee_id = 158)
	and
	salary > (select salary from EMPLOYEES where employee_id = 164)
order by "급여" desc;

--SA_REP 직종의 최소 급여보다 미만이면서
--직종이 SH_CLERK은 아닌 사원들의 이름, 직종, 급여를 출력
select
	first_name "이름",
	job_id "직종",
	salary "급여"
from EMPLOYEES
where
	salary < (select min(salary) from EMPLOYEES where job_id = 'SA_REP')
	and
	job_id != 'SH_CLERK'
order by job_id;

--100번 부서의 최소 급여보다 최소 급여가 초과하는
--다른 모든 부서들의 부서 번호, 최소 급여를 출력
select department_id, min(salary) from EMPLOYEES
having min(salary) > (select min(salary) from EMPLOYEES where department_id = '100')
group by department_id;

--성에 Bat가 포함되어 있는 사원과 같은 부서에 근무하는 사원들의 전체 정보를 입력
select * from EMPLOYEES
where department_id = (
    select department_id 
    from EMPLOYEES 
    where lower(last_name) like '%bat%'
);

--직종이 AD_PRES인 사원의 부하직원을 검색하여
--이름, 직종, 매니저 번호를 출력
select first_name, job_id, manager_id from EMPLOYEES
where manager_id in (select employee_id from EMPLOYEES where job_id = 'AD_PRES');

--직종이 ST_CLERK인 Julia와 같은 부서, 같은 직종으로 근무하는
--사원들 중에서 Mattew를 상사로 두고 있는 사원들의 사번, 이름, 직종, 상사 번호를 출력
SELECT employee_id, first_name, job_id, manager_id
FROM EMPLOYEES
WHERE 
    department_id = (
        SELECT department_id 
        FROM EMPLOYEES 
        WHERE first_name = 'Julia' AND job_id = 'ST_CLERK'
    )
    AND job_id = (
        SELECT job_id 
        FROM EMPLOYEES 
        WHERE first_name = 'Julia' AND job_id = 'ST_CLERK'
    )
    AND manager_id = (
        SELECT employee_id 
        FROM EMPLOYEES 
        WHERE first_name = 'Matthew'
    );
	

--직종이 ST_CLERK인 Julia와 같은 부서, 같은 직종으로 근무하는
--사원들 중에서 Mattew를 상사로 두고 있는 사원들의 사번, 이름, 직종, 상사 번호를 출력
select employee_id, first_name, job_id, manager_id from EMPLOYEES
where
	department_id =
	(select department_id from EMPLOYEES where job_id = 'ST_CLERK' and first_name = 'Julia')
	and job_id =
	(select job_id from EMPLOYEES where job_id = 'ST_CLERK' and first_name = 'Julia')
	and manager_id =
	(select employee_id from EMPLOYEES where first_name = 'Matthew');
	


