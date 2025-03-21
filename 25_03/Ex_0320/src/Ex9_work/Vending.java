package Ex9_work;

import java.util.ArrayList;
import java.util.List;

public class Vending {
//	 "Fanta", 1000
//  "Cider", 1100
//  "Orange", 1200
//  "Banana", 1300
//  "Coke", 1400
	private List<Can> cans = new ArrayList<>();
	private int money; // 사용자 입력 금액

	// 생성자에서 List로 캔 초기화
	public Vending() {
		cans.add(new Can("Fanta", 1000));
		cans.add(new Can("Cider", 1100));
		cans.add(new Can("Orange", 1200));
		cans.add(new Can("Banana", 1300));
		cans.add(new Can("Coke", 1400));
	}

	// 금액 입력 후 가능한 음료 목록 표시
	public void showDrink(int money) {
		this.money = money;

		for (Can can : cans) { // List로 반복
			if (can.getPrice() <= money) {
				System.out.printf("%s - %,d원%n", can.getName(), can.getPrice());
			}
		}
	}

	// 선택한 음료 제공 및 잔액 반환
	public void outDrink(String name) {
		boolean found = false;
		for (Can can : cans) { // List로 반복
			if (can.getName().equalsIgnoreCase(name)) {
				System.out.println(can.getName() + "(을)를 선택하셨습니다.");
				System.out.printf("잔돈 : %,d원%n", money - can.getPrice());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("해당 음료는 존재하지 않습니다.");
		}
	}
}