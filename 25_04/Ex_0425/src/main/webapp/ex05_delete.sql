--departments 테이블을 dept라는 새로운 테이블에 복사
create table dept as select * from departments;

select * from dept;

--dept 테이블의 전체 row를 삭제
delete from dept;

delete from dept
where department_name like 'S%';

--부서 이름이 15글자 이하인 부서만 삭제
delete from dept
where length(department_name) <= 15;
commit;

drop table dept;