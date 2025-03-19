package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_Map {
	public static void main(String[] args) {

//		Map은 키의 값은 중복이 되지만, 같은 키의 값은 (중복 X)덮어씌워진다.

		Map<String, Character> map1 = new HashMap<String, Character>();
		map1.put("key1", 'A');
		map1.put("key2", 'C');
		map1.put("key3", 'A');

		// 기존에 사용 중인 key 값과 동일한 key를 사용한다면 내용이 갱신됨.
		map1.put("key1", 'B');

		// Map에서 remove 메서드는 해당 키를 입력하면 값과 함께 키에 할당된 메모리가 삭제됨.
		map1.remove("key1");

		System.out.println("map1의 크기 : " + map1.size());
		System.out.println(map1);

		System.out.println(map1.get("key2"));

	} // main
}
