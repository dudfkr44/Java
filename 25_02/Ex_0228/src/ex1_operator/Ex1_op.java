package ex1_operator;

public class Ex1_op {
	public static void main(String[] args) {
		
		/*
		연산자(operator) 우선권
		1. 최고연산자 : . , ()
		2. 증감연산자 : ++, --
		3. 산술연산자 : +, -, *. /, %
		4. 시프트연산자 : >>, <<, >>>
		5. 비교연산자 : >, <, >=, <=, ==, !=
		6. 비트연산자 : &, |, ^, ~
		7. 논리연산자 : &&, ||, !
		8. 삼항(조건)연산자 : ?, :
		9. 대입연산자 : =, *=, /=, %=, +=, -=
		 */
		
		/* 산술연산
		 * 4칙연산과 나머지 연산자
		 */
		int n1 = 20; //자료형 int의 변수 n1의 값을 20으로 설정
		int n2 = 7; //자료형 int의 변수 n2의 값을 7로 설정
		int n3 = n1 + n2; //자료형 int의 변수 n3의 값을 n1 + n2의 합을 설정
		System.out.println("+ : " + n3);
		//산술연산자 +의 값 뒤에 해당 연산의 값을 표시
		n3 = n1 - n2;
		System.out.println("- : " + n3);
		//산술연산자 -의 값 뒤에 해당 연산의 값을 표시
		n3 = n1 * n2;
		System.out.println("* : " + n3);
		//산술연산자 *의 값 뒤에 해당 연산의 값을 표시
		n3 = n1 / n2;
		System.out.println("/ : " + n3);
		//산술연산자 /의 값 뒤에 해당 연산의 값을 표시
		n3 = n1 % n2;
		System.out.println("% : " + n3);
		//산술연산자 %의 값 뒤에 해당 연산의 값을 표시
		System.out.println("-------------");
		
		/* 대입연산자
		 * 특정 값을 변수에 전달하여 기억시키는 연산자
		 */
		int m1 = 10;
		int m2 = 5;
		m1 += m2; //m1 = m1 + m2
		System.out.println("+= : " + m1);
		// 대입연산자 += 출력값을 뒤에 표시
		m1 -= 1; //m1 = m1 - 1
		System.out.println("-= : " + m1);
		// 대입연산자 -= 출력값을 뒤에 표시
		m1 /= 7; //m1 = m1 / 7
		System.out.println("/= : " + m1);
		// 대입연산자 /= 출력값을 뒤에 표시
		m2 %= m1; // m2 = m2 % m1
		System.out.println("%= : " + m2);
		// 대입연산자 %= 출력값을 뒤에 표시
		
	} // main
}
