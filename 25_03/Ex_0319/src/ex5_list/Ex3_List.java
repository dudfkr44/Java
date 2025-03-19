package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_List {

//	찾을 문장 : blue
//	blue의 모든 index : [1, 3, 5]

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("blue");
		color.add("yellow");
		color.add("blue");

		while (true) {
			System.out.print("찾을 문장 (종료 - exit): ");
			String search = sc.next();

			if (search.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				break;
			}

			List<Integer> result = new ArrayList<>(); // 매 검색마다 초기화
			for (int i = 0; i < color.size(); i++) {
				if (color.get(i).equalsIgnoreCase(search)) {
					result.add(i);
				}
			}

			if (!result.isEmpty()) {
				System.out.println(search + "의 모든 index : " + result);
			} else {
				System.out.println("'" + search + "'을(를) 찾을 수 없습니다.");
			}
		}
		sc.close();
	}
}