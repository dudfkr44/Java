--그룹 함수
--여러 행 또는 테이블 전체에 대해 하나의 결과를 가져오는 함수
--1) avg() : 평균값
--2) count() : 검색이 완료된 행의 갯수
--전체 결과를 가져오려면 *을 넣어도 됨
--3) max() : 최대값을 구하는 함수
--4) min() : 최소값을 구하는 함수
--5) sum() : 합계를 구하는 함수

--그룹화가 되어 있지 않다면 일반 컬럼과 그룹 함수는 함께 사용할 수 없음

select count(commission_pct) "상여금 존재"
from EMPLOYEES;

--부서에 속해 있는 사원 수
select count(department_id) "부서에 속한 직원 수"
from EMPLOYEES;

--매니저 수를 출력
select count(distinct manager_id) "매니저 인원수"
from EMPLOYEES;

--'sa_rep' 직종의 급여 평균, 최고 급여, 최소 급여, 급여의 합을 출력
select 
    avg(salary) "급여 평균",
    max(salary) "최고 급여",
    min(salary) "최소 급여",
    sum(salary) "급여 총합"
from EMPLOYEES
where lower(job_id) in 'sa_rep';

--회사 전체의 사원 수, 보너스를 받는 사원 수, 부서 개수 출력
select
	count(*) "전체 사원 수", 
	count(commission_pct) "보너스를 받는 사원 수", 
	count(distinct department_id) "부서 개수"
from EMPLOYEES;

--50번 부서의 사원들의 최고 급여, 최소 급여 출력
select
	max(decode(department_id, 50, salary)) "최고 급여", 
	min(decode(department_id, 50, salary)) "최소 급여"
from EMPLOYEES;

--50번 부서의 사원들의 최고 급여, 최소 급여 출력
select
	max(salary) "최고 급여", 
	min(salary) "최소 급여"
from EMPLOYEES
where department_id in 50;