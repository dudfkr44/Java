package ex3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map_pre {
	public static void main(String[] args) {

//		id : y1555
//		pw : 3333
//		로그인 성공!

//		id : abc
//		아이디가 존재하지 않습니다.

//		id : kim123
//		pw : 2222
//		비밀번호 불일치

		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		// 초기 데이터
		map.put("kim123", 1111);
		map.put("park333", 2222);
		map.put("yi555", 3333);
		boolean login = false;

		while (!login) {
			System.out.print("ID : ");
			String id = sc.next();

			try {
				if (map.containsKey(id)) {
					System.out.print("PW : ");
					String inputPw = sc.next();
					int pw = Integer.parseInt(inputPw);
					if (map.get(id).equals(pw)) {
						System.out.println("로그인 성공!");
						login = true;
						break;
					} else {
						System.out.println("비밀번호 불일치");
						continue;
					}

				} else {
					System.out.println("존재하지 않는 ID입니다.");
					continue;
				}
			} catch (NumberFormatException e) {// try-catch
				System.out.println("숫자를 입력하세요.");
				continue;
			} // catch

		} // while
		sc.close();
	}// main

}