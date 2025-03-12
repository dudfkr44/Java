package NumberRotation;

import java.util.Scanner;

public class NumberRMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int n = sc.nextInt();
		sc.close();

		NumberR out = new NumberR();
		out.NumberR(n);

	} // main
}
