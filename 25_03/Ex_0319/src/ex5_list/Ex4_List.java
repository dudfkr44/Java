package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_List {
	public static void main(String[] args) {

//		문자열1 : aaa
//		문자열2 : bb
//		문자열3 : 123
//		문자열4 : a213123
//		문자열5 : ggggg
//		가장 긴 문자열 : a213123
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String word;

		for (int i = 1; i <= 5; i++) {
			System.out.printf("문자열%d :", i);
			word = sc.next();
			list.add(word);
		}

		// 최장 문자열 찾기 알고리즘
		String longStr = list.get(0); // 1. 첫 번째 요소로 초기화
		for (int i = 1; i < list.size(); i++) { // 2. 두 번째 요소부터 순회
			String current = list.get(i);
			if (current.length() > longStr.length()) { // 3. 길이 비교
				longStr = current; // 4. 더 긴 문자열로 교체
			}
		}

		System.out.println("가장 긴 문자열: " + longStr);
	}// main
}