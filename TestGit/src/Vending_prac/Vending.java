package Vending_prac;

import java.util.ArrayList;
import java.util.List;

public class Vending {
//	  "Fanta", 1000
//    "Cider", 1100
//    "Orange", 1200
//    "Banana", 1300
//    "Coke", 1400
	List<Can> cans = new ArrayList<Can>();

	public Vending() {
		cans.add(new Can("Fanta", 1000));
		cans.add(new Can("Cider", 1100));
		cans.add(new Can("Orange", 1200));
		cans.add(new Can("Banana", 1300));
		cans.add(new Can("Coke", 1400));
	}

	public void showDrink(int money) {

		for (Can can : cans) {
			if (can.getPrice() <= money) {
				System.out.printf("%s - %d원", can.getName(), can.getPrice());
			}
		}
	} // showDrink

	public void outDrink(String name, int money) {
		for (Can can : cans) {
			boolean found = false;
			if (can.getName().equalsIgnoreCase(name)) {
				System.out.printf("%s을(를) 선택하셨습니다.\n잔돈 : %d원", can.getName(), money - can.getPrice());
				found = true;
				break;
			}
			if (!found) {
				System.out.println("존재하지 않는 음료입니다.");
				break;
			}
		}

	} // outDrink

}