package test;

import java.util.Scanner;

public class Test05 {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 행의 갯수 : ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= (2 * i) - 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// main
}
