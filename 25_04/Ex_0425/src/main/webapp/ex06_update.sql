create table emp as select * from EMPLOYEES;

select * from emp;

--사원들의 급여를 1000달러로 수정
update emp set salary = 10000;
commit;

--commission_pct가 null인 직원들의 값을 0.1로 수정
update emp set commission_pct = 0.1
where commission_pct is null;
commit;

--근속 년수가 20년 이상인 사원들의 월급을 10000 인상.
update emp set salary = salary + 10000
where months_between(sysdate, hire_date) >= 240;
commit;

drop table emp;
commit;