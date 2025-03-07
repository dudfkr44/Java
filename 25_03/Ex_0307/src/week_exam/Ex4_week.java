package week_exam;

import java.util.Scanner;

public class Ex4_week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int n1 = sc.nextInt();
		System.out.print("수2: ");
		int n2 = sc.nextInt();
		System.out.print("연산자: ");
		String op = sc.next();
		int res = 0;
		
		switch(op) {
		case "+":
			op = "+";
			res = n1 + n2;
			System.out.printf("%d + %d = %d", n1, n2, res);
			break;
		case "-":
			op = "-";
			res = n1 - n2;
			System.out.printf("%d - %d = %d", n1, n2, res);
			break;
		case "*":
			op = "X";
			res = n1 * n2;
			System.out.printf("%d × %d = %d", n1, n2, res);
			break;
		case "/":
			op = "÷";
			if(n2 > n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
			}
			res = n1 / n2;
			System.out.printf("%d ÷ %d = %.1f", n1, n2, (float)res);
			break;
		default :
			System.out.println("올바른 연산자가 아닙니다.");
			break;
		}
		sc.close();
	} // main
}
