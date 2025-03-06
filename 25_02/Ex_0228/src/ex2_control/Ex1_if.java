package ex2_control;

public class Ex1_if {
	public static void main(String[] args) {
		
		
		/*
		 * 제어문(control statement)
		 * 프로그램의 흐름을 제어하는 문장
		 * 
		 * 분기문과 반목문이 있음
		 * 1. 분기문 : if, if-else, else-if, switch
		 * 2. 반복문 : for, while, do-while
		 */
		
		/* 단순 if문
		 * if(조건식){
		 * 조건식이 참일 때 실행되는 영역
		 * }
		 */
		int n = 51;
		
		//String은 ("")쌍따옴표 안에 여러 문자를 저장할 수 있는 자료형
		String str = "안녕하세요";
		
		//if문을 만나면 조건식을 먼저 확인
		if(n == 50) {
			//조건이 참일 때만 if문 영역으로 들어온다
			str = "반갑습니다";
		}
		if(n != 50) {
			
			str = "고맙습니다";
		}//if
		System.out.println(str);
		
		
	}//main
}
