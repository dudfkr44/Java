package ex1_test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 :");
		int num1 = sc.nextInt();
		System.out.print("수2 :");
		int num2 = sc.nextInt();
		
		for(int i = 1; ;i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println("최소공배수: " + i);
				break;
			}// if
		}// for
	} //main
}
