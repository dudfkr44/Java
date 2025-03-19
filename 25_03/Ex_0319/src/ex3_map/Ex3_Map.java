package ex3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {

//		id : y1555
//		pw : 3333
//		로그인 성공!

//		id : abc
//		아이디가 존재하지 않습니다.

//		id : kim123
//		pw : 2222
//		비밀번호 불일치

		String userid = "";
		int userpw = 0;
		Scanner sc = new Scanner(System.in);
		boolean login = false;

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim123", 1111);
		map.put("park333", 2222);
		map.put("yi555", 3333);

		while (!login) {
			System.out.print("id : ");
			userid = sc.next();
			if (map.containsKey(userid)) {
				// 아이디가 존재할 때

				System.out.print("pw : ");
				userpw = sc.nextInt();
				if (map.get(userid) == userpw) {
					// 비밀번호가 일치할 때

					System.out.println("로그인 성공!");
					login = true;
					break;
				} else {
					System.out.println("비밀번호 불일치");
					continue;
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
				continue;
			}
		}
		sc.close();
	} // main
}
