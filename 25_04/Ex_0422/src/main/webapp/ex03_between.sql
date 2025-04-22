--2006년 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순으로 출력
select employee_id, first_name, job_id, hire_date
from EMPLOYEES
where hire_date >= '2006-01-01' and hire_date <= '2006-12-31';

--between 연산자 : A와 B 사이의 값을 검색
select employee_id, first_name, job_id, hire_date
from EMPLOYEES
where hire_date between '2006-01-01' and '2006-12-31';

--월급이 5000 이상 6000 이하인 사원들의 사번, 이름, 급여를 출력
select employee_id, first_name, salary
from EMPLOYEES
where salary between '5000' and '6000';