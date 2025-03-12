package work;

import java.util.Scanner;

public class Ex8_work {
	public static void main(String[] args) {
//		키보드에서 입력받은 값을 암호화하여 출력하기
//		-------------------------
//		입력 : abc123
//		결과 : `~!wer
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String src = sc.nextLine();
		// 알파벳 매핑 배열 (a-z → 특수문자)
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };

		// 숫자 매핑 배열 (0-9 → qwertyuiop)
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String res = "";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			if (ch >= 'a' && ch <= 'z') { // 알파벳 소문자 처리
				res += abcCode[ch - 'a']; // a=0, b=1, ..., z=25
			} else if (ch >= '0' && ch <= '9') { // 숫자 처리
				res += numCode[ch - '0']; // 0=0, 1=1, ..., 9=9
			} else { // 기타 문자 처리
				res += ch;
			}
		}

		System.out.println("출력: " + res);
	}
}
