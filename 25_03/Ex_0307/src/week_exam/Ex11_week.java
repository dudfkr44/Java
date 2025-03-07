package week_exam;

import java.util.Scanner;

public class Ex11_week {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int num = sc.nextInt();

		if (num < 2 || (num % 2 == 0 && num != 2)) {
			System.out.printf("%d는 소수가 아닙니다.", num);
		} else {
			int i;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.printf("%d는 소수가 아닙니다.", num);
					break;
				}
			}
			if (i == num) {
				System.out.printf("%d는 소수입니다.", num);
			}
		}
		sc.close();
	}// main
}