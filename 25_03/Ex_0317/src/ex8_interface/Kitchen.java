package ex8_interface;

//인터페이스는 구현 능력이 없어 다중 구현도 가능(여러 부모 인터페이스를 가질 수 있음)
//인터페이스끼리 다중 상속(extends)이 가능하고 구현 정의된 인터페이스는 하나만 선언해도 다같이 구현됨
public class Kitchen implements Menu3 {

	@Override
	public String jjajang() {
		return "중면 + 춘장";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 오징어";
	}

	@Override
	public String tangsuyuck() {
		return "매진";
	}

	@Override
	public String boggembam() {
		return "밥 + 야채";
	}

}
