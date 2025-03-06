package ex2_valueType;

public class Ex1_valueType {
	public static void main(String[] args) {
		/*
		자료형 (기본자료형)
		논리형 : boolean - 1bit
		문자형 : char - 2byte
		정수형 : byte - 1byte ........ -128 ~ 127
			   short - 2byte ........ -32768 ~ 32767
			   int - 4byte ........ -21억 ~ 21억
			   long - 8byte ........ -900경 ~ 900경
		실수형 : float - 4.x byte 숫자 뒤에 F를 붙이거나, 변수 앞에 (float)를 붙이면 float 자료형 설정
			   double - 8.x byte
		변수 : 어떤 값을 저장하기 위해 이름을 지정한 공간
		변수 선언 규칙
		1. [자료형] 변수명;
		2. 변수명 = 값;
		3. [자료형] 변수명 = 값;
		
		1. 변수 선언 시 반드시 영소문자로 시작
		2. _ 제외한 특수문자를 포함할 수 없다.
		3. 숫자로 시작할 수 없다.
		4. 의미 있는 이름으로 짓기
		
		논리형 (boolean) : true, false. 즉, 참과 거짓의 두 가지 값만을 사용하는 자료형.
		 */
		
		//자료형과 값이 타입이 일치하지 않으면 문제 발생
		//boolean b0 = 1;
		
		boolean b1; //선언
		b1 = true; //대입
		b1 = false; //값 변경 가능
		
		//같은 영역 안에서 같은 이름의 변수가 정의될 수 없다.
		//boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		System.out.println("--------------------");
		
		//char 문자형 :  홑따옴표 안에 한 글자만 저장할 수 있는 자료형
		char ch1 = 'A';
		
		System.out.println("ch1 : " + ch1);
		
		char ch2 = 65 + 1;
		
		System.out.println("ch2 : " + ch2);
		
		char ch3 = '\u0041';
		System.out.println("ch3 : " + ch3);
	}
		

}
