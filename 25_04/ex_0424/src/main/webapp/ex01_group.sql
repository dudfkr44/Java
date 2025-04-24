--group by 절
--특정 컬럼(자료의 주제)을 기준으로 해당 레코드(하나의 행)를 묶어 자료를 관리할 때 사용하는 키워드

select first_name, count(*)
from EMPLOYEES
group by first_name;

--직종 별 인원수
--직종, 인원 수
select job_id, count(*) "인원 수"
from EMPLOYEES
group by job_id;

--매니저별 담당하는 직원 수 조회
--매니저 번호, 관리 인원 수
select manager_id, count(*) "관리 인원 수"
from EMPLOYEES
group by manager_id;

--각 부서별 인원 수, 급여의 평균, 급여의 총합을 출력

select 
	department_id, count(*) "부서별 인원 수",
	trunc(avg(salary), 1) "급여 평균",
	sum(salary) "급여 총합"
from EMPLOYEES
group by department_id;

--직종별 급여의 평균
select 
	job_id,
	round(avg(salary), 1) "급여 평균"
from EMPLOYEES
group by job_id;