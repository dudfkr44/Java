create table users(
	idx NUMBER(3) primary key,
	nickname VARCHAR2(20) null,
	name VARCHAR(30) not null,
	age NUMBER(3) not null
);

--자원 추가(insert)
insert into users(idx, name, age, nickname)
values(1, '홍길동', 20, 'hong');

insert into users(idx, name, age)
values(2, '이길동', 30);

insert into users values(
3, 'sam', '삼길동', 20
);
--약식으로 값을 바로 넣을 시 만들어질 당시 컬럼 순서로 값을 넣어야 함.

insert into users values(4, null, '사길동', 30);

commit; --변경된 데이터를 물리적으로 기록하기 위해 commit 필수!

drop table users;

select * from users;
-------------------------------------------------------

create table members(
	member_idx NUMBER(3) primary key,
	name VARCHAR2(30),
	email VARCHAR2(50) unique,
	join_date DATE
);

insert into members values(1, '일길동', 'one@exam.com', sysdate);

insert into members values(2, '이길동', 'two@exam.com', sysdate);

commit;
select * from members;

--장바구니 테이블
create table cart(
	cart_idx NUMBER(3) PRIMARY KEY,
	member_idx NUMBER(3),
	pruduct_name VARCHAR2(100),
	add_date DATE,
	--cart 테이블의 member_idx를
	--member 테이블의 member_idx의 외래키로 연결
	foreign key (member_idx) references members(member_idx)
);

insert into cart values(1, 1, '노트북', sysdate);

insert into cart values(2, 1, '마우스', sysdate);

commit;

select * from cart;