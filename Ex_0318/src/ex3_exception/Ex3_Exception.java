package ex3_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//try {
//	int num = sc.nextInt();
//	System.out.printf("결과 : %s", num);
//} catch (Exception e) {
//	String str = sc.next();
//	System.out.printf("%s은(는) 정수가 아닙니다.", str);
//}
//} 스트링 버그
public class Ex3_Exception {
	public static void main(String[] args) {
//		정수를 입력하세요.
//		정수 : 100
//		결과 : 100

//		정수 : aaa
//		aaa은(는) 정수가 아닙니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String input = sc.next();

		try {
			int number = Integer.parseInt(input);
			System.out.printf("결과 : %d", number); // 숫자인 경우 변환된 숫자 출력
		} catch (NumberFormatException e) {
			System.out.printf("%s(은)는 숫자가 아닙니다.", input); // 숫자가 아닌 경우 지정된 메시지 출력
		}
		sc.close();
	}
}
