package ex9_anonymous;

import java.util.Random;
import java.util.Scanner;

public class AnonyMain {
	public static void main(String[] args) {
		//익명 클래스
		//딱 한 번만 사용하고 버릴 객체를 생성할 때 사용하는 이름 없는 클래스의 개념
		int a = new Scanner(System.in).nextInt();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ss = sc.next();
		
		
		Random rnd = new Random();
		for(int i = 0; i < 5; i++) {
			int number = rnd.nextInt(5);
		}
		
		
		
	} // main
	
	
	
}
