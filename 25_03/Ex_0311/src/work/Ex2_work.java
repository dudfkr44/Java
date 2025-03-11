package work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

//		키보드에서 아무 값이나 무작위의 값을 받아
//		입력받은 값에서 소문자 a의 갯수를 출력

		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				cnt++;
			}
		}
		System.out.println("a의 갯수는 " + cnt + "개입니다.");

		sc.close();

	} // main
}
