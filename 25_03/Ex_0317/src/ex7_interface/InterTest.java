package ex7_interface;

public interface InterTest {
//	사용자와 클래스를 연결하는 중개자 역할

//	인터페이스의 구성 요소
//	1.상수
//	2.추상 메서드

	final int VALUE = 100; // 상수: final 키워드 사용, 전부 대문자로 표기
	abstract int getValue(); // 추상 메서드
}
