package ex4_super;

public class Parent {

	private int number = 100;
	int n = 20;

	public Parent(int n) {
		System.out.println("부모 클래스의 생성자");
	}

	public int getNumber() {
		return number;
	}
}
