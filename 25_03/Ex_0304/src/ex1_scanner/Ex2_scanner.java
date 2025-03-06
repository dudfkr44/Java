package ex1_scanner;

import java.util.Scanner;

public class Ex2_scanner {
	
	//스캐너를 이용하여 키보드에서 입력받은 값을 출력
	//--------------------
	//이름 : hong
	//나이 : 30
	//내 이름은 hong이고, 나이는 30 세입니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("나이 : ");
		int age = sc.nextInt();

		System.out.println("내 이름은 " + name + "이고, 나이는 " + age + " 세 입니다.");
		
		
		
	}//main
}
