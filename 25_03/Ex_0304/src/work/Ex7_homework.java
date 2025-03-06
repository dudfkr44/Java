package work;

import java.util.Scanner;

public class Ex7_homework {

	public static void main(String[] args) {
		/*
		 * 피보나치 수열 만들기 single for 문, swap 사용 1 1 2 3 5 8 13 21 .... next = a + b 반복횟수 :
		 * 입력값
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("반복횟수 : ");
		int num = sc.nextInt();
		int a = 1, b = 0, c = 0;

		for (int i = 0; i < num; i++) {
			b = c;
			c = a;
			a = b + c;
			System.out.print(c + " ");

		}
	}

}