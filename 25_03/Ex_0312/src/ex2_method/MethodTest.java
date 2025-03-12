package ex2_method;

public class MethodTest {

//	연습용 메서드
//	void 이외의 반환형 타입이 명시되어 있다면
//	해당 메서드는 반드시 return을 한 개 이상 가지고 있어야 한다.
	public int test(int n) {
		n += 100;
		System.out.println("n : " + n);
		return n;// return은 하나의 값만 담을 수 있으며 그 밑에 코드는 무시하고 코드를 종료한다.
	}
	
	public void test2() {
		System.out.println("test2");
		return;//반환형이 void라면 return에 값을 담을 수 없고 코드 종료의 의미
	}

}
