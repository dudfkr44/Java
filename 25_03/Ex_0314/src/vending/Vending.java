package vending;

public class Vending {

	private Can[] cans = new Can[5];
	private int money;

	public Vending() {
		cans[0] = new Can("Fanta", 1000);
		cans[1] = new Can("Cider", 1100);
		cans[2] = new Can("Orange", 1200);
		cans[3] = new Can("Banana", 1300);
		cans[4] = new Can("Coke", 1400);
	}

	// 음료 목록 초기화
//	public void init() {

//		for (int i = 0; i < cans.length; i++) {
//			cans[i] = new Can();
//		}

//		cans[0].setName("Fanta");
//		cans[0].setPrice(1000);
//
//		cans[1].setName("Cider");
//		cans[1].setPrice(1100);
//
//		cans[2].setName("Orange");
//		cans[2].setPrice(1200);
//
//		cans[3].setName("Banana");
//		cans[3].setPrice(1300);
//
//		cans[4].setName("Coke");
//		cans[4].setPrice(1400);

//	}  init

//	사용자가 준 금액을 확인하고
//	먹을 수 있는 음료수의 목록만 출력

	public void showDrink(int money) {
		this.money = money;

		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getPrice() <= money) {
				System.out.printf("%s - %,d원\r\n", cans[i].getName(), cans[i].getPrice());
			}
		} // for

	} // showDrink

	// 먹고 싶은 음료수를 제공하고 잔액을 돌려주기
	public void outDrink(String name) {
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getName().equalsIgnoreCase(name)) {
				System.out.println(cans[i].getName() + "(을)를 선택하셨습니다.");
				System.out.printf("잔돈 : %,d원", money - cans[i].getPrice());
			}

		} // for
	} // outDrink

}
