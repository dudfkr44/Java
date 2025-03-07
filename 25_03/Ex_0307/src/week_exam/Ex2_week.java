package week_exam;

import java.util.Scanner;

public class Ex2_week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		if(age >= 30) {
			System.out.println("드실 만큼 드셨군요.");
		} else {
			System.out.println("좀 더 드셔도 됨.");
		}
		sc.close();
	} // main
}
