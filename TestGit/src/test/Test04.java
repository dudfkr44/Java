package test;

import java.util.Scanner;

public class Test04 {

	/*
	문제 설명:
	사용자로부터 양의 정수(예: 5)를 입력받은 후, 입력된 수 만큼의 줄에 걸쳐 별(*)로 구성된 피라미드를 출력하는 프로그램을 작성하세요.
	피라미드는 다음과 같이 출력되어야 합니다. (예를 들어 입력 값이 5일 경우)

	    *
	   ***
	  *****
	 *******
	*********
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("다이아몬드의 너비가 최대인 줄의 수: ");
		num = sc.nextInt();
		
		for(int line = 1; line <= num; line++ ) {
			for(int space = 1; space <= num - line; space++) {
				System.out.print(" ");
				
			}
			
			for(int star = 1; star <= (2 * line) - 1; star++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
        for (int line = num - 1; line >= 1; line--) {
            for (int space = 1; space <= num - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * line) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

	}
		
		
}
