package ex1_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2_List {
	public static void main(String[] args) {

//	List를 두 개 생성해 1 ~ 5 사이의 난수를 5개 추가
//	두 리스트의 값을 비교하여 교집합을 출력
//	------------------
//	list 1 = [5, 3, 5, 1, 5]
//	list 2 = [2, 3, 1, 1, 3]
//	교집합 : [1, 3]
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> resList = new ArrayList<Integer>();
		Random ran = new Random();

		for (int i = 0; i < 5; i++) {
			list1.add(ran.nextInt(5) + 1);
			list2.add(ran.nextInt(5) + 1);
		}

		for (int n : list1) {

			if (list2.contains(n) && !resList.contains(n)) {
				resList.add(n);
			}
		}

		System.out.println("list1의 값 : " + list1);
		System.out.println("list2의 값 : " + list2);
		System.out.println("교집합 : " + resList);

	} // main

}
