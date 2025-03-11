package ex1_string;

public class Ex1_string {
	public static void main(String[] args) {
//		자바의 가장 대표적인 클래스 : String
//		1) 객체 생성 방법이 두 가지(암시적, 명시적)
//		2) 한 번 생성된 문자열의 내용은 변하지 않음(불변의 특징)
		String s1 = "abc";
		String s2 = "abc";
		
		if(s1 == s2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	} // main
}
