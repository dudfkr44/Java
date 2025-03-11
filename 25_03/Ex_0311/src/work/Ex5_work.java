package work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {

//		키보드에서 입력받은 문장에서 홀수번째 위치의 문자만 추출
		Scanner sc = new Scanner(System.in);
		System.out.print("문장: ");
		String str = sc.nextLine();
		String res = "결과 : ";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				res += str.charAt(i);
			}

		}

		System.out.println(res);
		sc.close();

	} // main
}
