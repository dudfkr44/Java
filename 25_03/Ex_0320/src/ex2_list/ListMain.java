package ex2_list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
	public static void main(String[] args) {

		List<Can> arr = new ArrayList<Can>();

		Can c1 = new Can();
		c1.setName("환타");
		c1.setPrice(1000);

		Can c2 = new Can();
		c2.setName("콜라");
		c2.setPrice(1100);

		arr.add(c1);
		arr.add(c2);

		System.out.println(arr.get(0).getName());
		System.out.println(arr.get(0).getPrice());
		
		System.out.println(arr.get(1).getName());
		System.out.println(arr.get(1).getPrice());

	} // main
}
