package work;

public class Ex3_homework {
	public static void main(String[] args) {
		/*
		 * 문제 설명: 사용자로부터 양의 정수(예: 5)를 입력받은 후, 입력된 수 만큼의 줄에 걸쳐 별(*)로 구성된 피라미드를 출력하는 프로그램을
		 * 작성하세요. 피라미드는 다음과 같이 출력되어야 합니다. (예를 들어 입력 값이 5일 경우)
		     *
		    ***
		   *****
		  *******
		 *********
		 * 
		 */
		int a = 5;
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= a - i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = a; i <= a; i++) {
			
		}
		
	} //main

}
