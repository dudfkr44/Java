--정렬(order by)
--요청한 쿼리로 실행된 결과로 반환되는 행들을 정렬하고자 할 때 쓰는 키워드
--order by 절은 select 절의 마지막에 기술

--오름차순 정렬: asc 키워드(order by의 기본 속성, 생략 가능)
--내림차순 정렬: desc 키워드(생략 불가능)

select * from EMPLOYEES;

--사번이 낮은 순부터 내림차순 정렬
select *
from EMPLOYEES
order by employee_id;

--사번이 높은 순부터 내림차순 정렬
select *
from EMPLOYEES
order by employee_id desc;

--상사번호가 높은 순으로 내림차순 정렬하되 입사일을 두번째 정렬 기준으로 오름차순 정렬해 사번, 이름, 상사 번호 순으로 출력
select employee_id, first_name, manager_id, hire_date
from EMPLOYEES
order by manager_id desc, hire_date;

--급여를 많이 받는 순으로 이름, 급여, 부서번호를 출력
--단 급여가 같을 경우 부서 번호를 오름차순으로 정렬
select first_name, salary, department_id
from EMPLOYEES
order by salary desc, department_id;

--월급이 15000 이상인 사원들의 정보를 입사일이 빠른 순으로
--사번, 이름, 급여, 입사일 정보를 출력
select employee_id, first_name, salary, hire_date
from EMPLOYEES
where salary >= 15000
order by hire_date;

--입사일이 빠른 순으로 정렬하며, 입사일이 같다면 이름 내림차순으로
--사번, 이름, 입사일 정보를 출력
select employee_id, first_name, hire_date
from EMPLOYEES
order by hire_date, first_name desc;

--사번, 이름, 입사일, 부서번호, 직종, 급여를 출력
--부서번호가 빠른 순, 직종이 빠른 순, 급여를 많이 받는 순으로 출력
select employee_id, first_name, hire_date, department_id, job_id, salary
from EMPLOYEES
order by department_id, job_id, salary desc;

--직종이 'st_clerk'이 아닌 사원 중
--사번, 이름, 직종의 정보를 직종 오름차순으로 출력
select employee_id, first_name, job_id
from EMPLOYEES
where job_id != 'ST_CLERK'
order by job_id;

--이름에 's'가 포함되어 있지 않은 사원 중
--사번, 이름의 정보를 이름 오름차순으로 출력
select employee_id, first_name
from EMPLOYEES
where first_name not like '%s%'
order by first_name;