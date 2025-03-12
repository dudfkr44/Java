package ex5_method;

import java.util.Scanner;

public class Test_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		Test t = new Test();
		int result = t.res(input);
		System.out.println(result);
		sc.close();
	} // main
}
