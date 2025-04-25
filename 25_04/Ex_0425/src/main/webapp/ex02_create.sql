-- sql 자료형
--1) NUMBER : 숫자 데이터를 저장
--	 idx NUMBER(2) -> 99까지의 정수 형태를 저장하기 위한 자료형
--	 idx NUMBER(2, 3) -> 99까지의 정수 + 실수 형태의 소수점 3자리까지 저장하기 위한 자료형
--2) DATE : 날짜와 시간 정보를 저장하기 위한 자료형
--3) CHAR
--	 VARCHAR : 고정된 메모리를 생성
--	 VARCHAR2 : 문자열 데이터를 저장하기 위한 자료형(유동적 메모리 관리)
--	 name VARCHAR2(20) -> 20byte 형태의 문자열 저장
--4) CLOB : 2gbyte의 큰 문자열을 담기 위한 자료형
--create : 테이블 생성하는 키워드

--테이블 생성
create table person(
	id NUMBER(2),
	name VARCHAR2(50)
);

--테이블에 컬럼 추가
alter table person add birth DATE;

--컬럼명 수정
alter table person
rename column birth to birthday;

--컬럼 자료형(속성) 변경
alter table person
modify name varchar2(10) not null;

--컬럼 삭제
alter table person
drop column birthday;

--테이블 삭제
drop table person;

--회원 정보를 저장하는 테이블(아이디, 비밀번호, 이름, 나이, 연락처, 가입일)
--기본키(primary key) : 고유한 식별자로써 속성에 대한 중복을 방지하는 키
--후보키(candidate key) : id, pwd, name 등의 기본키가 될 자격이 있는 컬럼
--중복 방지(unique) : 기본키 이외에 값을 중복 방지시키는 키워드
create table userInfo(
	id varchar2(20) primary key, --아이디(기본키 설정)
	pwd varchar2(20), --비밀번호
	name varchar2(20), --이름
	age number(3), --나이
	phone varchar2(50) unique, --연락처(중복 불가 설정)
	regdate date --가입일
);

--이메일을 저장하는 컬럼을 추가
alter table userInfo add email varchar(50);

--전화번호를 저장하는 컬럼을 삭제
alter table userInfo drop column phone;

--테이블 삭제
drop table userInfo;

