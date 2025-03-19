package ex4_list;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("조조");
		list.add("화타");
		list.add("유비");
		list.add("장비");
		System.out.println(list);
		System.out.println("-----------");
		// [조조, 화타, 유비, 장비]
		// [유비, 관우, 장비, 유봉, 관흥, 장포]
		list.set(0, "유비");
		list.set(1, "관우");
		list.remove(2);
		list.add("유봉");
		list.add("관흥");
		list.add("장포");

		System.out.println(list);
	} // main
}
