package ex3_method;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
//		수1 : 5
//		수2 : 3
//		연산자 : +
//		결과 : 5 + 3 = 8
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();

		System.out.print("수2 : ");
		int su2 = sc.nextInt();

		System.out.print("연산자 : ");
		String op = sc.next();

		Calculator c = new Calculator();
		c.calc(su1, su2, op);
		sc.close();

	} // main
}
