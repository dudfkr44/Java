package ex1_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {
//		자바의 가장 대표적인 클래스 : String
//		1) 객체 생성 방법이 두 가지(암시적, 명시적)
//		2) 한 번 생성된 문자열의 내용은 변하지 않음(불변의 특징)
		String s1 = "abc";// 암시적 객체 생성
		String s2 = "abc";// 암시적 객체 생성

		String s3 = new String("abc");// 명시적 객체 생성(new로 생성)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("s4 : ");
		String s4 = sc.next();
		sc.close();

//		객체간 == 을 통한 비교는
//		값이 아닌 주소를 비교한다.
		if (s1 == s4) {
			System.out.println("주소가 같습니다.");
		} else {
			System.out.println("주소가 다릅니다.");
		}
		
		if(s1.equals(s4)) {
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}
		
//		한 번 만들어진 문자열의 내용은 변경할 수 없다.
		String greet = "hi";
		greet += "hello"; //greet = greet + "hello"
		System.out.println(greet);
		
		String str1 = "hong";
		String str2 = "hong";
		str1 = " gil dong";
		System.out.println(str2 + str1);
		
		
	} // main
}
