-- join : 테이블과 테이블을 연결해 특정한 데이터를 얻고자 할 때 쓰는 키워드
--1) inner(생략 가능) join(equiJoin) : 조건이 정확히 일치하는 경우에 쓰는 키워드
--2) outer join : 조건이 정확히 일치하지 않는 경우에 쓰는 키워드
--3) self join : 하나의 테이블에서 특정 컬럼과 연결이 필요한 경우에 쓰는 키워드

--기본키 : 테이블의 컬럼들 중 값이 중복되지 않게 만든 키
--후보키 : 기본키 외에 값이 중복 허용되는 컬럼들을 일컫음
--외래키(Foreign Key) : 다른 테이블의 기본키와 데이터가 연결되어 다른 테이블의 기본키 기능을 하는 후보키를 일컫음

--사번, 이름, 부서 번호, 부서 이름


select emp.employee_id, emp.first_name, emp.department_id, dep.department_name
from EMPLOYEES emp, DEPARTMENTS dep
where emp.department_id = dep.department_id;

--inner Join으로 연결 시 조건 키워드는 on으로 쓰임
select emp.employee_id, emp.first_name, emp.department_id, dep.department_name
from EMPLOYEES emp inner JOIN DEPARTMENTS dep
on emp.department_id = dep.department_id;

--사원, 부서 테이블로부터 이름, 급여, 부서 이름을 출력
select e.first_name, e.salary, d.department_name
from EMPLOYEES e join DEPARTMENTS d
on emp.department_id = dep.department_id;

select emp.first_name, emp.salary, dep.department_name
from EMPLOYEES emp, DEPARTMENTS dep
where emp.department_id = dep.department_id;

--부서 테이블(departments), 지역 테이블(locations)로부터
--(department_name)부서 이름, (city)도시를 출력
select d.department_name, l.city
from DEPARTMENTS d, LOCATIONS l
where d.location_id = l.location_id;

--테이블을 연결할 때 출력할 컬럼이 각기 다른 곳에만 존재하고 컬럼이 헷갈리지 않는다면 
--불러온 테이블의 별칭을 앞에 붙이지 않아도 된다.
--단, where로 두 테이블을 연결할 때는 컬럼의 별칭을 써야만 한다.
select d.department_name, l.city
from DEPARTMENTS d join LOCATIONS l
on d.location_id = l.location_id;

--LOCATIONS, COUNTRIES 테이블을 조회해
--(city)도시명, (country_name)국가명을 출력
select l.city, c.country_name
from LOCATIONS l, COUNTRIES c
where l.country_id = c.country_id;

select l.city "도시명", c.country_name "국가명"
from LOCATIONS l join COUNTRIES c
on l.country_id = c.country_id;

--사원(EMPLOYEES) 테이블 및 (JOBS)직종 테이블을 조회해
--이름, 성, 이메일, 직종, 직종 풀네임(job_title) 순으로 조회
select e.first_name, e.last_name, e.email, e.job_id, j.job_title
from EMPLOYEES e, JOBS j
where e.job_id = j.job_id;

select e.first_name "이름", e.last_name "성", e.email "이메일", e.job_id "직종", j.job_title "직종 이름"
from EMPLOYEES e join JOBS j
on e.job_id = j.job_id;

--이름, 부서명(department_name), 도시(city)를 조회
select e.first_name, d.department_name, l.city
from EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
where e.department_id = d.department_id and l.location_id = d.location_id;

select e.first_name "이름", d.department_name "부서명", l.city "도시명"
from EMPLOYEES e
join LOCATIONS l on e.department_id = d.department_id
join DEPARTMENTS d on l.location_id = d.location_id;
--join 키워드 바로 뒤에 on 절을 붙일 수 있지만
--and, or 등을 키워드를 쓸 수 없어 조건값을 각각 따로 입력해야 함

--EMPLOYEES, DEPARTMENTS, LOCATIONS 테이블을 조회해
--이름(first_name), 성(last_name), 이메일(email), 부서 번호(department_id)
--부서명(department_name), 지역 번호(location_id), 도시(city) 출력하되
--도시가 'Seattle' 인 경우에만 출력
select e.first_name, e.last_name, e.email, e.department_id,
	   d.department_name, l.location_id, l.city
from EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
where e.department_id = d.department_id 
	  and d.location_id = l.location_id
	  and l.city = 'Seattle';

select e.first_name "이름", e.last_name "성", e.email "이메일", e.department_id "부서 번호",
	   d.department_name "부서명", l.location_id "지역 번호", l.city "도시"
from EMPLOYEES e
join DEPARTMENTS d on e.department_id = d.department_id
join LOCATIONS l on d.location_id = l.location_id
where l.city = 'Seattle';

--COUNTRIES, REGION 테이블을 조회해
--국가명(country_name), 대륙명(REGION_name)
select c.country_name, r.region_name
from COUNTRIES c, REGIONS r
where c.region_id = r.region_id;

select c.country_name, r.region_name
from COUNTRIES c
join REGIONS r on c.region_id = r.region_id;

--LOCATIONS, COUNTRIES, REGION 테이블을 조회해
--도시(city), 국가명(country_name), 대륙명(region_name) 출력

select l.city, c.country_name, r.region_name
from LOCATIONS l, COUNTRIES c, REGIONS r
where c.region_id = r.region_id and l.country_id = c.country_id;

select l.city, c.country_name, r.region_name
from LOCATIONS l
join COUNTRIES c on l.country_id = c.country_id
join REGIONS r on c.region_id = r.region_id;

-- department_name, street_address, city를 출력

select d.department_name, l.street_address, l.city
from DEPARTMENTS d, LOCATIONS l
where d.location_id = l.location_id;

select d.department_name, l.street_address, l.city
from DEPARTMENTS d
join LOCATIONS l on d.location_id = l.location_id;

--각 부서의 부서장의 이름을 출력

select d.department_name, e.first_name
from DEPARTMENTS d join EMPLOYEES e on d.manager_id = e.employee_id;

select d.department_name, e.first_name
from DEPARTMENTS d join EMPLOYEES e on d.manager_id = e.employee_id;

--직원들의 이름과 성을 붙이고, 부서 이름, 도시 이름 출력

select 
    e.first_name || ' ' || e.last_name fullname,
    d.department_name, l.city
from EMPLOYEES e
join DEPARTMENTS d on e.department_id = d.department_id
join LOCATIONS l on d.location_id = l.location_id;

select 
    e.first_name || ' ' || e.last_name fullname,
    d.department_name, l.city
from EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
where e.department_id = d.department_id and d.location_id = l.location_id;

--부서명, 도시, 국가, 대륙별 근무 인원수를 직원이 많은 순서대로 정렬하고
--20명 이상인 대륙만 출력
select 
	d.department_name,
    l.city, 
    c.country_name,
    r.region_name, 
    COUNT(*) "인원수"
from 
    EMPLOYEES e
join DEPARTMENTS d on e.department_id = d.department_id
join LOCATIONS l on d.location_id = l.location_id
join COUNTRIES c on l.country_id = c.country_id
join REGIONS r on c.region_id = r.region_id
group by
    l.city, 
    c.country_name, 
    r.region_name
having 
    count(*) >= 20
order by 
    "인원수" desc;

--부서명, 도시, 국가, 대륙별 근무 인원수를 직원이 많은 순서대로 정렬하고
--20명 이상인 대륙만 출력
select d.department_name, l.city, c.country_name, r.region_name, count(*) "인원 수"
from
	EMPLOYEES e
join DEPARTMENTS d on e.department_id = d.department_id
join LOCATIONS l on d.location_id = l.location_id
join COUNTRIES c on l.country_id = c.country_id
join REGIONS r on c.region_id = r.region_id
group by d.department_name, l.city, c.country_name, r.region_name
having count(*) >= 20
order by "인원 수" desc;

--경력이 가장 오래된 사원의 사번, 이름, 급여, 입사일, 부서명을 출력
select 
    e.employee_id, 
    e.first_name, 
    e.salary, 
    e.hire_date, 
    d.department_name
from 
    EMPLOYEES e
join DEPARTMENTS d on e.department_id = d.department_id
where
	e.hire_date = (select min(hire_date) from EMPLOYEES);

--outer join : 검색 조건이 정확히 일치하지 않아도 검색된 모든 행을 출력(null 값 포함)
select e.first_name, d.department_name, d.department_id
from employees e
full outer join departments d on e.department_id = d.department_id;

--self join : 공통된 테이블 내에서 같은 컬럼의 값을 다르게 표시해야 할 때 쓰는 키워드
--같은 값을 다르게 출력해야 할 경우 여러번 공통된 테이블을 참조할 때 쓰임
select e.employee_id, e.first_name, e.job_id, e.manager_id, e2.first_name
from EMPLOYEES e, EMPLOYEES e2
where e.manager_id = e2.employee_id;
