package ex2_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
//		컬렉션 프레임워크(Collection Framework) : 많은 수의 데이터를
//		그 사용 목적에 적합한 자료 구조로 묶어서 하나로 그룹화 한 객체
//		--대표적인 컬렉션 객체들--
//		1) Set
//		2) Map
//		3) List

//		Set은 특정 코드에서 중복된 값의 허용이 있어서는 안 될 때 사용하는 객체
		Set<String> hs1 = new HashSet<String>();
		hs1.add("홍길동");
		hs1.add("김길동");
		hs1.add("유비");
		hs1.add("유비");
		System.out.println(hs1);
		System.out.println(hs1.size());

		hs1.remove("홍길동");
		System.out.println(hs1);
		System.out.println(hs1.size());
		
		//set -> 배열
		String[] sArr = hs1.toArray(new String[0]);
		
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
		
		sArr[0] = "관우";
		//배열 -> Set
		hs1 = new HashSet<String>( Arrays.asList(sArr));
		System.out.println(hs1);
		
		
		
		

	} // main
}
