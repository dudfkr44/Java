package ex11_static;

public class Bank {

	private String point; // 지점
	private String tel; // 전화번호
	static float interest; // 이자율

	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10;
	}
//	결과 출력 메서드
	public void information() {
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("-------------------");
	} // information
}
