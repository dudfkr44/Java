package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {

	public static void main(String[] args) {
		
		//키보드에서 값을 입력받을 수 있도록 해주는 Scanner 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int n = sc.nextInt();
		System.out.println("입력받은 값 : " + n);
		
		System.out.println("문장 : ");
		String s = sc.next();
		System.out.println("입력받은 문장 : " + s);
		
	}//main

}
