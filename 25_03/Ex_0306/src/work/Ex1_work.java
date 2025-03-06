package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
//		사용자에게 숫자를 입력받아 1부터 입력받은 수까지의 합을 구하되
//		합이 20을 넘으면 반복을 종료한다.
//		-------------------------------
//		정수 : 5
//		총합 : 15
//		-------------------------------
//		정수 : 10
//		합이 20을 초과하여 반복을 종료합니다.
//		총합 : 21

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int res = 0;

		for (int i = 1; i <= num; i++) {
			res += i;
			if (res > 20) {
				System.out.println("합이 20을 초과하여 반복을 종료합니다.");
				break;
			} // if
		} // for
		System.out.println("총합 : " + res);

	}// main

}
