package week_exam;

import java.util.Scanner;

public class Ex10_week {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int n1 = sc.nextInt();
		System.out.print("수2: ");
		int n2 = sc.nextInt();
		if (n2 < n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for (int i = n1; i < n2; i++) {
			n1 += i + 1;
		}
		System.out.printf("결과값: %d", n1);
		sc.close();
	} // main
}
