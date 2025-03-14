package ex2_palindrome;

import java.util.Scanner;

public class Ex2_Palindrome_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String ori = sc.next();

		Palindrome ch = new Palindrome();
		ch.charCheck(ori);
		sc.close();

	} // main

}
