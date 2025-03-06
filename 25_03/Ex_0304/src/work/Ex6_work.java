package work;

import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {

		/*
		 * 
		 * 수1를 포함한 수2까지의 숫자의 합을 출력
		 * 수1: 2
		 * 수2: 5
		 * 결과값 : 12
		 * 또는
		 * 수1: 5
		 * 수2: 2
		 * 결과값 : 12
		 */
		Scanner sc = new Scanner(System.in);
		int result = 0, num1 = 1, num2 = 2;

		System.out.print("수1: ");
		num1 = sc.nextInt();
		System.out.print("수2: ");
		num2 = sc.nextInt();

		if (num1 > num2) {// num1이 num2보다 클 때 num1과 num2의 수를 치환
			int num3 = num1;
			num1 = num2;
			num2 = num3;
		}

		for (int i = num1; i <= num2; i++) {// 수1의 값을 초기값으로 환산, 조건값이 수2보다 작거나 같을 때까지 1씩 더해서
			result += i;//i의 값에 result에 합산
		}

		System.out.println("합산한 결과값: " + result);
	}
}
