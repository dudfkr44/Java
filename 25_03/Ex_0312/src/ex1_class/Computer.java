package ex1_class;

public class Computer {
		
//	클래스의 구성요소(클래스를 구성하기 위해서는 (변수나 메서드를 하나 이상 필요))
//	변수(속성, 멤버)
//	메서드(함수)
	private String company = "Samsung";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
//	컴퓨터의 사양을 확인하기 위한 메서드
//	메서드 : 어떤 작업을 수행하기 위한 명령문들의 집합
//	반복적으로 사용되는 코드를 줄이기 위해 필요
	
//	접근제한자	반환형	메서드명(인자, 파라미터, 매개변수)	{실행영역}
//	public	void	getInfo()	{}
	public void getInfo() {
		
		System.out.println("제조사 : " + company);
		System.out.println("ssd :" + ssd + "GB");
		System.out.println("ram :" + ram + "GB");
		System.out.println("cpu :" + cpu + "GHz");
		System.out.println("color :" + color);
		System.out.println("-----------------------");
	}
	
//	접근제한자
//	1. public : 같은 프로젝트 내의 모든 객체에게 사용을 허가
//	2. private : 현재 클래스 내에서만 사용을 허가
//	3. protected : 상속 단계의 객체들에게만 사용을 허가
//	4. default : 기본값, 같은 패키지의 모든 객체에게 사용을 허가
//	비접근제한자
//	1. final : 다른 클래스에 사용을 허가하나 해당 변수를 수정할 수 없음
//	2. static: 클래스 레벨의 멤버로 지정
//	3. abstract: 추상 메서드/클래스 선언
//	4. synchronized: 스레드 동기화
//	5. transient: 직렬화 제외
//	6. volatile: 메모리 가시성 보장
	
}
