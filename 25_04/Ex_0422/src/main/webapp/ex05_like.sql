--like(유사 검색): 지정한 문자 형태와 일치하거나 포함하고 있는 자원을 검색

--이름 맨 이름 뒷글자가 a인 사원들의 사번, 이름을 조회
select employee_id, first_name
from EMPLOYEES
where first_name like '%a';

-- % : 모든 값을 의미
-- _ : 하나의 값을 의미
-- 'A%' : A로 시작하는 모든 값
-- '%a' : a로 끝나는 모든 값
-- '%a%' : a를 포함하는 모든 값(위 조건값 포함)
-- 'A____' : A로 시작하는 다섯 글자 단어

--이름 맨 이름 뒷글자가 a인 사원들의 사번, 이름을 조회
select employee_id, first_name
from EMPLOYEES
where first_name like 'A%';

--이름이 D로 시작하는 사원의 사번, 이름, 성을 출력
select employee_id, first_name, last_name
from EMPLOYEES
where first_name like 'D%';

--이름의 세번째 글자가 a인 사원의 사번, 이름, 성을 출력
select employee_id, first_name, last_name
from EMPLOYEES
where first_name like '__a%';

--이름이 여섯글자이며 네번째 글자가 a인 사원의 사번, 이름을 출력
select employee_id, first_name
from EMPLOYEES
where first_name like '___a__';

-- 이름의 시작은 S, 끝은 n인 사원의 이름을 출력
select first_name from EMPLOYEES
where first_name like 'S%n';

-- 이름의 시작은 H, 여섯글자 이상인 사원의 사번, 이름을 출력
select employee_id, first_name
from EMPLOYEES
where first_name like 'H_____%';

-- 2005년도에 입사한 사원들의 사원의 사번, 이름, 입사일을 출력
select employee_id, first_name, hire_date
from EMPLOYEES
where hire_date like '05%';
-- like 연산자 사용 시 연도는 뒤에 두 글자만 입력

-- 이름에 o가 포함되어 있으면서 a로 끝나는 사원들의 이름, 입사일을 출력
select first_name, hire_date
from EMPLOYEES
where first_name like '%o%a';

-- 전화번호가 011로 시작하지 않는 사원들의 이름, 전화번호를 출력
select first_name, phone_number
from EMPLOYEES
where phone_number not like '011%';

-- 직종에 SA, IT가 포함되어 있지 않는 사원들의 사번, 이름, 직종을 출력
select employee_id, first_name, job_id
from EMPLOYEES
where job_id not like '%SA%' and job_id not like '%IT%';