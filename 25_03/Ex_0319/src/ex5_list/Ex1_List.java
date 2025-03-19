package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_List {
	public static void main(String[] args) {

		// id : aaa
		// [ aaa ]
		// id : ccc
		// [ aaa, ccc ]
		// id : x
		// 종료

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String id = "";

		out: while (true) {
			System.out.print("id : ");
			id = sc.next();

//			if (list.contains(id)) {
//				System.out.println("중복된 아이디입니다.");
//				continue;
//			}

			for (int i = 0; i < list.size(); i++) {
				if (id.equals(list.get(i))) {
					System.out.println("중복된 아이디입니다.");
					continue out;
				} // inner
			} // outer

			if (id.equalsIgnoreCase("x")) {
				System.out.println("종료");
				break;
			}

			try {
				Integer.parseInt(id); // 숫자로 변환 시도
				System.out.println("문자를 입력해야 합니다.");
				continue; // 숫자면 리스트에 추가하지 않고 다음 입력으로
			} catch (NumberFormatException e) {
				// 숫자가 아닌 경우(문자인 경우) 리스트에 추가
				list.add(id);
				System.out.println(list);
			}
		}
	}
}