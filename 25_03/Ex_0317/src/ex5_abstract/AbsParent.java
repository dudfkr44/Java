package ex5_abstract;

public abstract class AbsParent {// 추상 메서드가 1개 이상 정의되어 있는 클래스 - 추상 클래스
	//추상 클래스는 abstract를 통해 자신이 추상임을 반드시 명시해야 한다.
	int value = 100;

	public int getValue() {
		return value;
	}

	// 실행할 내용(body)이 없는 메서드 - 추상 메서드
	// 추상 메서드는 미완성된 개념을 상속받은 자식이
	// 완성시키도록 하는 것이 조건
	public abstract void setValue(int n);

}
