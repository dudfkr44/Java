package test;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");

			} // inner
			for (int k = 0; k <= (2 * i) - 2; k++) {
				System.out.print("*");

			} // inner
			System.out.println();
		} // outer

	} // main

}
