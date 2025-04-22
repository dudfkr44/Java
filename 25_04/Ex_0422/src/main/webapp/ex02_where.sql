--where 절: 조건을 통해 자원을 검색하고자 할 때 사용하는 키워드

--사번이 150 이상인 사원들만 조회
select * from EMPLOYEES
where employee_id >= 150;

--급여가 10000 이상인 사원들의 정보를 사번, 이름, 이메일, 급여 순으로 출력
select employee_id, first_name, email, salary from EMPLOYEES
where salary >= 10000;

select * from EMPLOYEES
where hire_date != '2003-06-17';

