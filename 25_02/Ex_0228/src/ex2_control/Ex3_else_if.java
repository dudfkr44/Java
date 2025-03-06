package ex2_control;

public class Ex3_else_if {
	public static void main(String[] args) {

		/*
		 * 다중 if문 if( 조건식1 ){ 조건식1이 참일 때 실행되는 영역 }else if( 조건식2 ){ 조건식2가 참일 때 실행되는 영역
		 * }else{ 모든 조건이 거짓일 때 반드시 실행되는 영역 }
		 */

		int num = -10;
		String result = "";

		if (num >= 90 && num <= 100) { //90~100
			result = "A";
		} else if (num >= 80 && num <= 89) { //80~89
			result = "B";
		} else if (num >= 70 && num <= 79) { //70~79
			result = "C";
		} else if (num >= 60 && num <= 69) { //60~69
			result = "D";
		} else if (num >= 0 && num <= 59){ //59이하
			result = "F";
		} else {
			result = "점수는 0점부터 100점까지 입력해야 합니다.";
		}
		
		System.out.println(result);
		
		System.out.println("-------------");
		
		/* 변수 number에 1 ~ 3 사이의 값을 대입한다.
		 * 1을 선택하면 "게임 시작"
		 * 2를 선택하면 "설정"
		 * 3을 선택하면 "종료"
		 * 값이 1 ~ 3 사이의 값이 아니면 "올바른 메뉴를 입력하세요."를 출력하는 else if를 입력
		 */
		
		int num1 = 0;
		
		if(num1 == 1) {
			System.out.println("게임 시작");
		} else if(num1 == 2) {
			System.out.println("설정");
		} else if(num1 == 3) {
			System.out.println("종료");
		} else {
			System.out.println("올바른 메뉴를 입력하세요.");
		}
		
		

	}// main
}
