package character;

import java.util.Scanner;

public class Character_sample {

	public static void main(String[] args) {
//	키보드에서 입력받은 값이 회문인지 판단
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String ori = sc.next();// 원본
		String rev = "";// 원본을 뒤집어서 저장할 변수

		for (int i = ori.length() - 1; i >= 0; i--) {
			rev += ori.charAt(i);

		}

		if (ori.equals(rev)) {
			System.out.println(ori + "는 회문입니다.");
		} else {
			System.out.println(ori + "는 회문이 아닙니다.");
		}
		sc.close();

	} // main

}
