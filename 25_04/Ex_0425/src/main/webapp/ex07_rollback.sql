create table dept as select * from DEPARTMENTS;

select * from dept;

delete from dept;
commit;

--삭제된 dept 내용을 롤백(되돌리기)
insert into dept
select * from dept as of timestamp(
	--			   interval '1' day
	--			   interval '2' hour
	systimestamp - interval '6' minute
);

drop table dept;
commit;