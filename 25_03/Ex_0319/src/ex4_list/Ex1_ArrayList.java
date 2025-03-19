package ex4_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_ArrayList {
	public static void main(String[] args) {

		// List(부모 클래스) : 배열(Array)의 상위 호환(배열의 크기를 미리 지정하지 않아도 추가된 값만큼 배열의 방을 지정)
		// ArrayList(자식 클래스)

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(17);
		list.add(50);
		list.add(10);

		// list의 2번 인덱스의 값을 30으로 변경
		list.set(2, 30);

		// list의 1번 인덱스를 제거
		list.remove(1);

		// 마지막 인덱스에 13을 추가
		list.add(13);

		// 100을 갖는 2번 인덱스를 새로 추가하고 기존 2번 인덱스부터 1씩 밀림
		list.add(2, 100);

		System.out.println(list.size());
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		if (list.contains(100)) {
			System.out.println("100이 존재함");
		}
	} // main

}
