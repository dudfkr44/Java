package ex1_string;


public class Ex2_String_method {
	public static void main(String[] args) {

//		메소드 : 어떤 작업을 수행하기 위한 명령문들의 집합
//		반복적으로 사용되는 코드를 줄이기 위해서 재활용성의 극대화를 위해 필요한 기능

		String name = "Hong Gil Dong";
		int len = name.length();
		System.out.println("name의 길이 : " + len);

		int index = name.indexOf('o');
		System.out.println("맨 처음 소문자 o의 위치: " + index);

		index = name.indexOf("Gil");
		System.out.println("문자열 Gil이 시작하는 위치 : " + index);

		index = name.lastIndexOf('o');
		System.out.println("마지막 o의 위치: " + index);

		char ch = name.charAt(5);
		System.out.println("추출한 문자: " + ch);

		String str = name.substring(1, 7);
		System.out.println("잘라낸 문장: " + str);

		String fruit = "apple";
		if (fruit.equals("apple")) {
			System.out.println("값이 같다");
		}

		if (fruit.equalsIgnoreCase("Apple")) {
			System.out.println("대소문자는 달라도 의미는 같아");
		}

		String id = " user12     ";
		System.out.println(id.length());
//		trim(): 문자열 앞, 뒤의 의미없는 공백을 임시로 제거하는 메서드 단, 원래 담긴 값은 저장됨
		String checkId = id.trim();
		System.out.println(id.length());

		if (checkId.equals("user12")) {
			System.out.println("로그인 성공");
		}

//		문자열 형식의 숫자를 ("10") 연산이 가능한 정수 구조로 변경하는 함수(메서드)
		String number = "100";
		int num2 = Integer.parseInt(number);
		
		num2 += 10;
		System.out.println(num2);
		
//		기본 자료형의 Wrapper 클래스(부모 클래스)
//		int -> Integer
//		char -> Character
//		boolean -> Boolean
//		byte -> Byte
//		short -> Short
//		long -> Long
//		float -> Float
//		double -> Double
		
	} // main
}
