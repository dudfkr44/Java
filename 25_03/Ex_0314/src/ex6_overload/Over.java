package ex6_overload;

public class Over {

//	메서드의 오버로드(오버로딩)
//	메서드의 '중복 정의'의 개념이며 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러 개 정의되는 것
//	---------
//	오버로딩의 규칙
//	1. 인자의 수가 다른 경우 예: 메서드(), 메서드(1)
//	2. 인자의 수가 같아도 자료형(타입)이 다른 경우 예: 메서드('A'), 메서드(1)
//	3. 인자의 갯수가 다른 경우 예: 메서드('A'), 메서드(3, 'A')
//	4. 인자의 자료형의 나열이 다른 경우 예: 메서드('A', 3), 메서드(3, 'A')

	public void result() {
		System.out.println("인자가 없는 메서드");
	} // result

	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	} // result

	public void result(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	} // result

	public void result(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	} // result

	public void result(String str, int num) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	} // result
}
