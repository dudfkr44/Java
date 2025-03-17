package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
//		자식인 Child 클래스는 Parent 부모 클래스의 멤버 변수를 상속받기 때문에
//		자신의 클래스 안에 부모의 변수가 없어도 가져다 사용할 수 있음

		Child c1 = new Child();
//		상속 관계에서 부모 클래스가 가진 속성이 private로 선언되지 않는 한 자식 클래스는 부모의 속성을 사용할 수 있음
		
//		System.out.println(c1.money);
		System.out.println(c1.car);
		System.out.println(c1.realestate);
		
//		부모 클래스는 상속 관계여도 자식 클래스의 속성을 사용할 수 없음
		Parent p1 = new Parent();
//		System.out.println(p1.str);
		
//		Child는 Parent의 자식이므로
//		두 객체는 인스턴스가 같다.
		if(c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
	
		
		
	} // main
}
