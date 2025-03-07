package test;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최대값 : ");
		int input = sc.nextInt();
		int i = 1;
		int res = 0;

		for (i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				continue;
			}
			res += i;
		}

		System.out.printf("1부터 %d까지의 숫자 중 홀수의 합산값은 %d입니다.", input, res);
		sc.close();
	} // main
}
