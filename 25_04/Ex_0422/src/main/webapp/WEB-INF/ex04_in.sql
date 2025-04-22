--직종이 'sa_man', 'it_prog', 'hr_rep'인 사원들의 사번, 이름 직종을 출력
select employee_id, first_name, job_id
from EMPLOYEES
where job_id = 'SA_MAN' or job_id = 'IT_PROG' or job_id = 'HR_REP';

--in 연산자: 주어진 목록에서 정확히 일치하는 값들을 조회
select employee_id, first_name, job_id
from EMPLOYEES
where job_id in ('SA_MAN', 'IT_PROG', 'HR_REP');

--사번이 100, 102, 104, 106번인 사원들의 사번, 이름, 급여를 조회
select employee_id, first_name, salary
from EMPLOYEES
where employee_id in (100, 102, 104, 106);

--급여가 각각 2200, 3200, 5000, 6800인 사원들의 이름, 급여를 출력
select first_name, salary
from EMPLOYEES
where salary in(2200, 3200, 5000, 6800);