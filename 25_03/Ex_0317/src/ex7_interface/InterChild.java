package ex7_interface;

public class InterChild implements InterTest {
	// 인터페이스는 자식 클래스를 지정할 때 implements 키워드를 통해 '구현'.

	@Override
	public int getValue() {
		// 상수는 수정이 불가능
//		VALUE = 50;
		return VALUE;
	}

}
