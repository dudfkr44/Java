package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
//		Map은 key, value를 하나로 묶어 관리
//		key값을 알면 원하는 value를 바로 얻어낼 수 있으므로
//		많은 양의 데이터를 검색하는 데 있어서 매우 뛰어난 성능을 가짐
		
		
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 200);
		System.out.println("map1의 크기 : " + map1.size());
		System.out.println(map1);

		System.out.println(map1.get(3));
		
		if(map1.containsKey(1)) {
			System.out.println("map1에는 key1이 있다.");
		}
		
		if(map1.containsValue(200)) {
			System.out.println("map1에는 200이라는 값이 있다.");
		}
			
		
	} // main
}
