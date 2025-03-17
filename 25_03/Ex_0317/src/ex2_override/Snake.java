package ex2_override;

public class Snake extends Animal {

	String sensor = "밤에도 시야가 좋음";

//	메서드 오버라이드
//	메서드의 재정의' 의미를 가지며,
//	상속 관계의 객체에서 부모의 함수를 가져오되, 내용만
//	현재 클래스 사정에 맞도록 재정의하는 것
	
	@Override
	public int getLeg() {
		return 0;
	} // getLeg
}
