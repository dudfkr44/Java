--SQL의 함수
--1) 문자 함수
--2) 숫자 함수
--3) 날짜 함수
--4) 그룹 함수
--5) 기타 함수
--dual - 오라클에서 제공하는 가상의 테이블, 함수 계산의 결과값을 임시로 확인하기 위해 사용

--1) 문자 함수
--initcap - (' ')공백이나 (/)슬래쉬를 구분자로 나눈 단어의 맨 앞 글자를 대문자로 바꿔주는 함수
select initcap('good morning') from dual;
select initcap('good/morning') from dual;

--upper() - 소문자를 대문자로 바꿔주는 함수
select upper('good morning') from dual;
select first_name, upper(first_name) myname from EMPLOYEES;

--lower() - 대문자를 소문자로 바꿔주는 함수
select lower('GOOD MORNING') from dual;
select lower(job_id) myname, first_name from EMPLOYEES;

--'michael'로 조회했을 때, Michael의 사번, 이름을 표시
select employee_id, first_name from EMPLOYEES
where first_name = initcap('michael');

--'michael'로 조회했을 때, Michael의 사번, 이름을 표시
select employee_id, first_name from EMPLOYEES
where lower(first_name) = 'michael';

--이름 중간에 'm'이 들어간 사원의 사번, 이름을 표시
select employee_id, first_name from EMPLOYEES
where lower(first_name) like '%m%';

--lpad() : 죄측의 자리수를 늘리는 함수(바이트 단위, 영문 1바이트, 한글 2바이트)
--(원문, 바이트 단위(문자 길이), 채워넣을 문자)
select lpad('good', 6, '#') from dual;
select lpad('good', 8, '안녕') from dual;

--rpad() : 우측의 자리수를 늘리는 함수(바이트 단위, 영문 1바이트, 한글 2바이트)
--(원문, 바이트 단위(문자 길이), 채워넣을 문자)
select rpad('good', 6, '@') from dual;
select rpad('good', 8, '안녕') from dual;

--이름 앞에 *을 붙여서 10byte씩 추가
--이름 뒤에 #을 붙여서 10byte씩 추가
--해당 결과를 사번, 변경된 이름1, 변경된 이름2 순으로 출력하고
--원래 이름의 오름차순으로 출력
select employee_id, lpad(first_name, 10, '*') name1, rpad(first_name, 10, '#') name2
from EMPLOYEES
order by first_name;

--ltrim() : 좌측 문자를 제거, 맨 좌측 글자부터 지울 철자를 포함해 삭제(공백도 제거 가능)
--(원본 문자열, 구분자)
--중간에 있는 철자는 삭제 불가능
select ltrim('good', 'g') from dual;
select ltrim('      good', ' ') from dual;

--rtrim() : 우측 문자를 제거, 맨 우측 글자부터 지울 철자를 포함해 삭제(공백도 제거 가능)
--(원본 문자열, 구분자)
--중간에 있는 철자는 삭제 불가능
select rtrim('good', 'd') from dual;
select rtrim('good      ', ' ') from dual;

--substr() : 특정 문자를 잘라내는 함수
--(원본 문자, 시작할 문자열, 끝 문자열)
--3번째 기준자 포함해 뒤에 있는 글자를 잘라내어 표기(앞에 글자 삭제)
select substr('hello john', 3) from dual;

--3번째 기준자 포함해 뒤에 공백을 포함한 5글자까지 잘라내어 표기
select substr('hello john', 3, 5) from dual;

--입사일은 연도만 출력되도록 사번, 이름, 입사일을 출력
select employee_id, first_name, substr(hire_date, 1, 2) hire_year
from EMPLOYEES;

--모든 사원의 사번과 이름을 앞의 세글자만 표기하고
--뒷부분은 *로 변경하여 5글자로 출력하는 형태로 출력
select employee_id, rpad(substr(first_name, 1, 3), 5, '*') name
from EMPLOYEES;

--replace() : 특정 문자를 교체하는 함수
--(원본 문자, 탐색 문자, 치환 문자)
select replace('good morning', 'good', 'bad')
from dual;

--length() : 문자열의 길이를 참조
select first_name, length(first_name) len
from EMPLOYEES;

--이름이 6글자를 초과하는 사원들의 사번, 이름 출력
select employee_id, first_name from EMPLOYEES
where length(first_name) > 6;

--instr() : 좌측부터 특정 문자열의 표시된 위치 값(숫자)을 찾아 (반환)출력하는 함수
--(원본 문자열, 탐색 문자열)
select instr('banana', 'na')
from dual;

--이름에 'ra'가 포함된 사원들의 사번, 이름 조회
select employee_id, first_name
from EMPLOYEES
where instr(first_name, 'ra') != 0;

--부서 번호가 50번인 사원의 이름에 'el'을 '**' 대체해서 출력
select employee_id, replace(first_name, 'el', '**') name, department_id
from EMPLOYEES
where department_id in 50;

--이름 마지막 2글자를 '**' 대체해서 사번, 이름 출력
select employee_id, replace(first_name, substr(first_name, length(first_name) - 1, 2), '**') name
from EMPLOYEES;

--이름 마지막 2글자를 '*' 대체해서 사번, 이름 출력
select employee_id, rpad(substr(first_name, 1, length(first_name) - 2), length(first_name), '*') name
from EMPLOYEES;

--이름 앞 글자 2개를 제외한 나머지를 '*'로 대체해 사번, 이름 출력
select employee_id, rpad(substr(first_name, 1, 2), length(first_name), '*') name
from EMPLOYEES;

--concat() : 문자를 연결하는 함수
--(앞 문자열, 뒤 문자열)
select concat('hong', 'gildong') name from dual;
select concat(first_name, last_name) fullname from EMPLOYEES;

--|| : 오라클 DB에서 문자열을 이어 붙이는 연산자
select first_name || last_name from EMPLOYEES;

