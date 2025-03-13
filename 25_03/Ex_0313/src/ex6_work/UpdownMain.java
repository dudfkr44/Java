package ex6_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {// Class A
//		1 ~ 50 사이의 난수를 발생시켜 Up, Down 체크
//		1) 값을 입력받는 클래스는 A
//		2) 정답을 맞히고 프로그램을 완전히 종료하는 클래스는 A
//		3) 입력받은 값이 Up인지 Down인지 판단하는 클래스는 B
//		--------------
//		입력 : 30
//		Down!!
//		입력 : 15
//		Up!!
//		입력 : 25
//		3회 만에 정답!
		
		Scanner sc = new Scanner(System.in);
		Updown updown = new Updown();
		int cnt = 0;
		System.out.print("입력 : ");
		int user = sc.nextInt();
			updown.check(user);
		System.out.println("종료합니다.");
		sc.close();
		return;
	} // main
}
