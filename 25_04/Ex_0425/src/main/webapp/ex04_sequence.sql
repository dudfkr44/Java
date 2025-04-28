--시퀀스(sequence)
--중복되지 않는 연속적인 번호를 만들어주는 기능
create sequence serial_seq
start with 1 --시작값
increment by 1 -- 증가값
maxvalue 999 -- 증가할 수 있는 최대값
minvalue 1 -- 증가할 수 있는 최소값
nocache -- 캐시 메모리 사용 안 함

create table goods(
	goods_no NUMBER(3) primary key,
	goods_name VARCHAR2(100),
	goods_price NUMBER(5)
);

--시퀀스를 통해 테이블에 중복되지 않는 굿즈 번호를 설정
insert into goods values(serial_seq.nextval, '라이언 키링', 8000);

insert into goods values(serial_seq.nextval, '춘식이 빵', 3000);

commit;

--serial_sql.nextval : 시퀀스 번호를 알아서 증가시켜 출력
--serial_sql.currval : 현재 시퀀스 번호값
select serial_sql.currval from dual;

select * from goods;

--학생 관리 시퀀스
create sequence stu_seq;

--시퀀스 삭제
drop sequence stu_seq;

create table student(
	hakbun NUMBER(8) primary key,
	name VARCHAR2(50),
	major VARCHAR2(50)
);

insert into student values(stu_seq.nextval, '일길동', '경제학과');

insert into student values(stu_seq.nextval, '이길동', '회계학과');
commit;


drop table student;

select * from student;
