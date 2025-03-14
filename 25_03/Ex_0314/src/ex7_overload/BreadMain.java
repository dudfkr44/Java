package ex7_overload;

public class BreadMain {
	public static void main(String[] args) {
//		빵을 만들었습니다. < ---- 메서드 1
//		------------
//		빵을 만들었습니다.
//		빵을 만들었습니다.
//		요청하신 2개의 빵을 만들었습니다. < ---- 메서드 2를 호출한 결과
//		------------
//		크림빵을 만들었습니다.
//		크림빵을 만들었습니다.
//		요청하신 2개의 크림빵을 만들었습니다. < ---- 메서드 3를 호출한 결과
		
		Bread br = new Bread();
		br.makeBread();
		System.out.println("-----------");
		br.makeBread(2);
		System.out.println("-----------");
		br.makeBread(3, "크림빵");
		
	} // main
}
