--where 절에는 그룹 함수를 쓸 수 없음
--having : 그룹 함수가 포함되어 있는 조건식에서 반드시 필요한 키워드
--where 절은 group by 키워드 위에 기재해야 함
--having 절은 group by 키워드 밑에 기재해야 함
--where, having 절(조건 키워드)에는 별칭을 사용할 수 없음

select
	department_id,
	max(salary) "최대 급여", 
	min(salary) "최소 급여"
from EMPLOYEES
where department_id is not null
group by department_id
having max(salary) >= 8000;

--직종이 IT_PROG인 사원들의 급여 평균, 급여 합을 출력
select
	job_id "직종",
	avg(salary) "급여 평균", 
	sum(salary) "급여 총합"
from EMPLOYEES
where job_id in 'IT_PROG'
group by job_id;

--부서번호, 직종, 인원 수 출력
--단, 직종이 man으로 끝나는 경우만 출력해야 하고
--인원 수가 5명 이상이 부서만 출력

select
	department_id "부서 번호",
	job_id "직종", 
	count(*) "인원 수"
from EMPLOYEES
where job_id like '%MAN'
group by department_id, job_id
having count(*) >= 5;

--부서별 급여 총합, 급여 평균(소수점 2자리 반올림), 인원 수
--단, 급여 총합이 3만 이상인 경우에만 출력

select
	department_id "부서 번호",
	sum(salary) "급여 총합",
	round(avg(salary), 2) "급여 평균", 
	count(*) "인원 수"
from EMPLOYEES
group by department_id
having sum(salary) >= 30000;

--각 부서별 부서번호, 최대 급여, 최소 급여, 인원 수를 출력
--단, 부서를 가지고 있는 사람만 출력
--최대 급여가 8천 이상인 경우만 출력

select
	department_id "부서 번호",
	max(salary) "최대 급여",
	min(salary) "최소 급여", 
	count(*) "인원 수"
from EMPLOYEES
where department_id is not null
group by department_id
having max(salary) >= 8000
order by "부서 번호";

--각 부서별 평균 급여(소수점 없이 버림)를 조회
--단 평균 급여가 1만 미만인 경우만 조회
--부서 번호가 50 이하인 경우만 조회
select
	department_id "부서 번호",
	trunc(avg(salary)) "평균 급여"
from EMPLOYEES
where department_id <= 50
group by department_id
having trunc(avg(salary)) < 10000
order by "부서 번호";