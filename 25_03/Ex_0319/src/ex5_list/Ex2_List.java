package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2_List {

	public static void main(String[] args) {

//		ArrayList에 1 ~ 30 사이의 난수를 5개 추가
//		리스트에 추가된 값 가장 큰 값을 찾아 출력

		Random rnd = new Random();
		List<Integer> list = new ArrayList<>();
		int num = 0;

		for (int i = 0; i < 5; i++) {
			num = rnd.nextInt(30) + 1; // 1~30 사이의 난수를 변수 num에 할당
			if (!list.contains(num)) { // list 변수에 num의 값이 없는지 체크(중복 체크)
				list.add(num);// list에 추가
			}
		} // for

		System.out.println(list);

		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i); // max 변수에 list(i)번째의 값을 대입
			}
		}

//		int max = list.get(0); // 첫 번째 요소를 초기 최대값으로 설정
//		for (int n : list) { // num 변수에 list에 든 값을 할당
//			if (n > max) { // 변수 n에 담긴 값이 각 list 인덱스에 할당된 값보다 크다면
//				max = n; // max 변수에 n의 값을 대입
//			}
//		}

		System.out.printf("가장 큰 값: %d", max);
	}
}