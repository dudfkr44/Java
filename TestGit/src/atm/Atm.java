package atm;

public class Atm {
//	1.입   금 :
//	2.출   금 :
//	3.잔액 확인 :
//	etc.종 료
//	--- 입금 ---
//	입금액 : 1000
//	입금 성공
//	-----------
//	1.입   금 :
//	2.출   금 :
//	3.잔액 확인 :
//	etc.종 료
//	>> 3
//	잔액 : 1000
//	-----------
	private int money;

	public void atmMain(int choice) {
		System.out.println("1.입    금");
		System.out.println("2.출    금");
		System.out.println("3.잔액 확인");
		System.out.println("4.종    료");
	} // atmMain

	public void deposit(int money) {
		this.money += money;
		if (this.money != 0) {
			System.out.println("입금 성공!");
		}
	} // deposit

	public int withdraw(int money) {
		if (this.money < money) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		} else {
			this.money -= money;
			System.out.println("출금 성공!");
			return money;
		}
	} // withdraw

	public void balance() {
		if (money > 0) {
			System.out.printf("잔액 : %d원\n\n", money);
		} else {
			System.out.println("남은 잔액이 없습니다.");
		}
	} // balance

}
