package ex5_abstract;

public class AbsChild extends AbsParent {
//	추상 클래스가 부모인 자식 클래스는
//	부모가 갖고 있는 미완성의 추상 메서드를 반드시 받아둬야 한다.
	
	
	@Override
	public void setValue(int n) {
		System.out.println("자식이 완성시킴!!");
	}
	
}
