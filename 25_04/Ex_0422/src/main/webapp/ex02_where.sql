--where 절: 조건을 통해 자원을 검색하고자 할 때 사용하는 키워드

--사번이 150 이상인 사원들만 조회
select * from EMPLOYEES
where employee_id >= 150;

--급여가 10000 이상인 사원들의 정보를 사번, 이름, 이메일, 급여 순으로 출력
select employee_id, first_name, email, salary from EMPLOYEES
where salary >= 10000;

--입사일이 2003-06-17 이 아닌 사원들의 정보를 모두 출력
select * from EMPLOYEES
where hire_date != '2003-06-17';

--입사일이 2003-06-17 이후인 사원들의 정보를 모두 출력
select * from EMPLOYEES
where hire_date >= '2003-06-17';

--이름이 it_prog 인 사원들의 정보를 사번, 이름, 급여, 입사일 순으로 출력
select employee_id, first_name, salary, hire_date from EMPLOYEES
where first_name = 'Michael';

--직종이 it_prog 인 사원들의 정보를 사번, 이름, 직종, 급여 순으로 출력
select employee_id, first_name, job_id, salary from EMPLOYEES
where job_id = 'IT_PROG';

--2006년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순으로 출력
SELECT employee_id, first_name, job_id, hire_date 
FROM EMPLOYEES 
WHERE hire_date >= '2006-01-01' AND hire_date <= '2006-12-31';

--상여금이 null이 아닌 사원들의 정보를 이름, 급여, 상여 백분율 순으로 출력
select first_name, salary, commission_pct
from EMPLOYEES
where commission_pct is not null;

--급여가 5000을 초과하면서 10000 보다는 아래인 사원들의 사번, 이름, 급여를 출력
select first_name, salary, commission_pct
from EMPLOYEES
where salary > '5000' and salary <= '10000';

--급여가 5000을 미만이거나 20000 이상인 사원들의 이름, 급여를 출력
select first_name, salary
from EMPLOYEES
where salary < '5000' or salary >= '20000';
