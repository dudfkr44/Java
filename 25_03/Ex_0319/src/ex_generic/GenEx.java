package ex_generic;

public class GenEx<T> {
//	 제너릭 프로그래밍
//	 일반적인 변수나 메서드를 작성하되, 이 코드를
//	 다양한 타입의 객체에 대하여 재사용이 용이하도록 설계된
//	 클래스를 이용하는 객체 지향 기법

	T value;

	public T getValue() {
		return value;
	} // getValue

	public void setValue(T value) {
		this.value = value;
	} // setValue

}
