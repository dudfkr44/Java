package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		AbsChild abs = new AbsChild();
		
		
//		추상 클래스는 완성되지 않는 기능을 가지고 있어서
//		이 기능이 제대로 완성되기 전까지는 직접적으로 메모리를 할당받을 수 없다.
		AbsParent p = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				
			}
		}
		
	} // main
}
