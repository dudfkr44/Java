package work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

//		키보드에서 입력받은 문장을 한 글자씩 쪼개서 출력
//		값 : JAVA
//		J
//		A
//		V
//		A

		Scanner sc = new Scanner(System.in);
		System.out.print("값: ");
		String c = sc.next();

		for (int i = 0; i < c.length(); i++) {
			System.out.println(c.charAt(i));
		}

	} // main
}
