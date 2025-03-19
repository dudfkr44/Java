package ex3_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_Exception {
	public static void main(String[] args) {
//		나누기 연산만을 수행하는 계산식을 만들고 아래 결과를 출력

//		수1 : 10
//		수2 : 2
//		결과 : 10 / 2 = 5.0

//		수1 : 10
//		수2 : 0
//		결과 : 0으로 나눌 수 없습니다.

//		수1 : a
//		오류 : 정수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("수1 : ");
			int n1 = sc.nextInt();
			System.out.print("수2 : ");
			int n2 = sc.nextInt();
			if (n1 < n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}
			int res = n1 / n2;
			System.out.printf("결과 %d / %d = %d", n1, n2, res);
		} catch (InputMismatchException e) {
			System.err.println("정수가 아닙니다.");
		} catch (ArithmeticException e) {
			System.err.println("정수는 0으로 나눌 수 없습니다.");
		}
		sc.close();
	} // main
}
