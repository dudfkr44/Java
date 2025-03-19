package ex2_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {

	public static void main(String[] args) {
		
		//부모 클래스 : Set
		//자식 클래스 : HashSet, TreeSet
		// HashSet : 한 자리의 숫자를 제외한 오름차순 정렬 없음
		// TreeSet : 오름차순 정렬

		HashSet<Integer> hs = new HashSet<Integer>();

		System.out.print("로또 번호 : ");

		while (true) {

			int r = new Random().nextInt(45) + 1;
			hs.add(r);

			if (hs.size() == 6) {
				break;
			}

		}

		System.out.print(hs);

		System.out.println();

		System.out.print("로또 번호 : ");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while (true) {
			int r = new Random().nextInt(45) + 1;
			ts.add(r);

			if (ts.size() == 6) {
				break;
			}

		}

		System.out.print(ts);

		Set<Integer> set = new HashSet<Integer>();

	} // main

}
