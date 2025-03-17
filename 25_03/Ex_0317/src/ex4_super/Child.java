package ex4_super;

public class Child extends Parent {

//		super : 부모 클래스

	public Child(int n) {
		super(10); // 부모 클래스의 생성자 기본적으로 자식 클래스에는 숨겨짐, 파라미터 값이 있을 경우 작성
		super.n = n;
		System.out.println("자식 클래스의 생성자");
	}

	@Override
	public int getNumber() {
//		부모 클래스의 getNumber() 메서드를 가져온다.
		// super.getNumber();
		return 200;
	}
}
