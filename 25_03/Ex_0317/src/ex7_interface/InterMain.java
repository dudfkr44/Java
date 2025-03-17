package ex7_interface;

public class InterMain {
	public static void main(String[] args) {
		
		InterChild ic = new InterChild();
		
//		추상 메서드를 가지고 있는 인터페이스는 직접적인 메모리 할당이 불가능하다.
//		인터페이스는 미완성의 개념을 가지고 있으므로 완성될 때까지 메모리 할당이 불가능
		InterTest it = new InterTest() {
			
			@Override
			public int getValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
	} // main
}
