--view : 조회를 목적으로 하는 가상의 테이블

--사원 테이블로부터 원하는 정보들을 얻기 위한 view를 생성
create or replace view emp_view as
select employee_id, first_name, hire_date, job_id
from EMPLOYEES;

select * from emp_view;

--직종이 ST_CLERK인 데이터만 조회한 후 view를 생성
create or replace view emp_view as
select employee_id, first_name, hire_date, job_id from EMPLOYEES
where job_id = 'ST_CLERK';

--학생 성적 관리 테이블 생성
create table score(
	id NUMBER(3) primary key,
	name VARCHAR2(30) not null,
	kor NUMBER(3) not null,
	eng NUMBER(3) not null,
	math NUMBER(3) not null
);

create sequence seq_score;

insert into score values(
	seq_score.nextval, '홍길동', 100, 20, 80
);

insert into score values(
	seq_score.nextval, '김길순', 90, 87, 79
);

insert into score values(
	seq_score.nextval, '오길준', 73, 85, 91
);

commit;

select * from score;


--일련번호, 이름, 국어, 영어, 수학, 총점, 평균까지 출력하는 view 생성
create or replace view score_view as
select id, name, kor, eng, math,
       (kor + eng + math) total_score, 
       round((kor + eng + math) / 3) avg_score
from score;

select * from score_view;

--employees, jobs, departments를 조회
--사번, 사원들의 풀네임, 직종, 직종 풀네임(job_title), 급여, 부서명을 조회하는 view 생성
--해당 view의 모든 내용을 직종 오름차순으로 정렬

create or replace view emps_view as
select e.employee_id, e.first_name || ' ' || e.last_name full_name, e.job_id,
	   j.job_title, e.salary, d.department_name
from EMPLOYEES e
join JOBS j on e.job_id = j.job_id
join DEPARTMENTS d on e.department_id = d.department_id;

select * from emps_view order by job_id;