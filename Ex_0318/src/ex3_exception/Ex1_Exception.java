package ex3_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Exception {
	public static void main(String[] args) {

//		정수 : 10
//		입력받은 수 : 10
//		
//		정수 : a
//		정수만 입력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		try {
			int n = sc.nextInt();
			System.out.printf("입력받은 수 : %d", n);

		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		}
		sc.close();
	} // main

}
