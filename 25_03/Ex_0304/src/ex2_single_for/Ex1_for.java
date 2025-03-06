package ex2_single_for;

public class Ex1_for {

	public static void main(String[] args) {

		/*
		 * for문 : 특정 명령을 조건식이 거짓이 될 때까지 반복적으로 수행하기 위해 사용하는 반복문 for(초기식; 조건식; 증감식){ 조건식이
		 * 참일 때 실행되는 영역 }
		 */

		int num = 5;// 전역변수(글로벌변수): 메인에서 선언한 변수는 for문 안에서도 사용 가능

		for (int i = 0; i <= 2; i++) {// i는 지역변수(로컬변수)
			System.out.println(i);
		} // for
			// for문 안에서 만든 지역변수(i)는 main 영역에서는 사용 불가능

		System.out.println("----------------------");

		// 10부터 1까지 감소되는 값을 출력하는 for문을 만드세요.

		for (int i = 10; i >= 1; i--) { // for문 안에서 선언한 지역변수 i는 다른 for문에서 선언한 지역변수 i와 중복해서 사용 가능
			System.out.println(i);
		} // for

		System.out.println("----------------------");

		// 1부터 100까지 반복하는 for문을 만들되, 3의 배수만 출력
		for (int i = 3; i <= 100; i += 3) {
			System.out.println(i);
		} // for
		
		System.out.println("----------------------");

		// 1부터 100까지 반복하는 for문을 만들되, 3의 배수만 출력
		for (int i = 0; i <= 100; i++) {
			if(0 == i % 3) {
				System.out.println(i);
			} // if
		} // for
	} // main

}
