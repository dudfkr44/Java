package ex8_objstream;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();

		System.out.println("1. 새로 등록");
		System.out.println("2. 불러오기");
		System.out.print(">> ");

		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.print("이름 : ");
			user.setName(sc.next());

			System.out.print("나이 : ");
			user.setAge(sc.nextInt());

			System.out.print("전화번호 : ");
			user.setTel(sc.next()); // 중복 불가한 전화번호만 저장
			// user 객체를 저장
			UserSave us = new UserSave();
			us.writeInfo(user);
			break; // 유저 등록

		case 2:
			System.out.print("전화 번호 : ");
			String tel = sc.next();

			// 전화 번호를 통해 유저 정보를 불러옴
			UserLoad ul = new UserLoad();
			ul.loadInfo(tel);

			if (user != null) {
				System.out.println("이름 : " + user.getName());
				System.out.println("나이 : " + user.getAge());
				System.out.println("전화번호 : " + user.getTel());
			}

			break; // 유저 불러오기
		}
		sc.close();
	} // main
}
