package character;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
//	키보드에서 입력받은 값이 회문인지 판단
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String ori = sc.next();
		String rev = "";

		for (int i = ori.length() - 1; i >= 0; i--) {
			rev += ori.charAt(i);
		}

		if (ori.equalsIgnoreCase(rev)) {
			System.out.println("해당 문자열은 회문입니다.");
		} else {
			System.out.println("해당 문자열은 회문이 아닙니다.");
		}

	} // main

}
