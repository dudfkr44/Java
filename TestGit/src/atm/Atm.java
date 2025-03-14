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
//	1.입   금
//	2.출   금
//	3.잔액 확인
//	etc.종 료
//	>> 3
//	잔액 : 1000
//	-----------
	private int money = 0;

	public void atmMain(int check) {
		System.out.println("1.입   금");
		System.out.println("2.출   금");
		System.out.println("3.잔액확인");
		System.out.println("4.종   료");
		System.out.print(">> ");
	} // atmMain

	public void deposit(int money) {
		System.out.print("입금액 : ");
		this.money += money;

	} // deposit

	public int withdraw(int money) {

		if (this.money < money) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		} else {
			System.out.println("출금 성공!");
			this.money -= money;
			return money;
		}
	} // withdraw

	public void balance(int money) {
		System.out.printf("잔액 : %d", money);
	} // balance

}
