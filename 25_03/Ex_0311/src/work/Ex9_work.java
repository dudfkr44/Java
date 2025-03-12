package work;

import java.util.Scanner;

public class Ex9_work {
	public static void main(String[] args) {

		String[][] actor = { { "[song]", "박쥐", "기생충", "관상" }, { "[jeong]", "놈놈놈", "서울의 봄", "비트" },
				{ "[lee]", "레드", "광해", "지아이조" } };

		Scanner sc = new Scanner(System.in);
		System.out.print("배우 이름: ");
		String name = sc.nextLine();
		int cnt = 0;

//		배우 이름 : lee
//		[lee]
//		레드
//		광해
//		지아이조
//		----------------
//		배우 이름 : lee
//		해당 배우의 정보가 없습니다.

		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].equalsIgnoreCase("[" + name + "]")) {
				for (int j = 0; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				} // inner
			} else {
				cnt++;
				if (cnt == actor.length) {
					System.out.println("해당 배우의 정보가 없습니다.");
				}
			}
		} // outer
		sc.close();
	}// main

}
