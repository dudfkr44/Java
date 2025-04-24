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

--부서번호, 직종별 그룹의 급여의 합
select
	department_id,
	job_id,
	sum(salary)
from EMPLOYEES
group by department_id, job_id
order by department_id;

--부서별 급여의 합을 내림차순을 정렬
select
	department_id,
	sum(salary) "급여 총합"
from EMPLOYEES
group by department_id
order by "급여 총합" desc;

--부서별 급여의 합, 인원 수 급여의 평균을 출력
--인원 수가 많은 부서부터 출력
select
	department_id "부서 번호",
	sum(salary) "급여 총합",
	count(*) "인원 수",
	round(avg(salary), 1) "급여 평균"
from EMPLOYEES
group by department_id
order by "인원 수" desc;

--부서 직종을 그룹화하여 결과를 부서번호, 직종, 인원 수 순으로 출력
--부서 번호 오름차순으로 출력
select
	department_id "부서 번호",
	job_id "직종",
	count(*) "인원 수"
from EMPLOYEES
group by department_id, job_id
order by "부서 번호";

--부서, 직종별 급여의 합, 인원 수 평균 급여 출력
--부서 번호가 낮은 순, 급여의 합이 큰 순으로 정렬
select
	department_id "부서 번호",
	job_id "직종",
	sum(salary) "급여의 합",
	count(*) "인원 수",
	round(avg(salary), 1) "평균 급여"
from EMPLOYEES
group by department_id, job_id
order by "부서 번호", "급여의 합" desc;

