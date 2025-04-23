--부서번호가 90이거나 80인 사원들을
--부서번호, 급여 순으로 오름차순 정렬
select distinct department_id, salary
from EMPLOYEES
where department_id in (80, 90)
order by department_id, salary;

--distinct 중복 제거하는 키워드(select 다음으로 입력)(인자의 정보가 완전히 같은 자원 중 하나만 출력)
--union 중복 제거하는 키워드(두개의 다른 sql문을 연결하는 역할)(오름차순을 정렬하는 기능 포함)

select department_id, salary
from EMPLOYEES
where department_id in 90
union 
select department_id, salary
from EMPLOYEES
where department_id in 80

--union은 서로 다른 테이블 조합해서 조회할 수 있음(중복 제거와 오름차순 정렬 기능 구현)
select department_id from DEPARTMENTS
union
select salary from EMPLOYEES;

--intersect: 서로 다른 테이블 조합해서 나온 공토된 결과값을 출력(교집합)
select salary from EMPLOYEES where department_id > 90
intersect
select salary from EMPLOYEES where department_id <= 80

--급여, 부서 번호 순으로 검색
--부서번호가 100인 사람을 제외
--급여 오름차순으로 중복을 제거하여 출력
select distinct salary, department_id
from EMPLOYEES
where department_id != 100
order by salary;


--minus: 서로 다른 테이블 두 개의 정보를 첫번째 정보값에서 두번째 정보값을 뺀 나머지의 결과값을 출력
select salary, department_id from EMPLOYEES
minus
select salary, department_id from EMPLOYEES
where department_id = 100;

--
select
from EMPLOYEES
where
