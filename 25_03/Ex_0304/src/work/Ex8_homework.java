package work;

import java.util.Scanner;

public class Ex8_homework {
	
	public static void main(String[] args) {
		/*
		 * if
		 * 키보드에서 연도를 입력받고, 해당 연도가 윤년인지를 판단
		 * 윤년을 구하는 공식 : 4로 나누어 떨어지지만 100으로는 나누어지지 않는 연도
		 * 400으로 나누어 떨어지는 연도
		 * 연도 : 2000
		 * 2000년은 윤년입니다.
		 * 
		 * 연도 : 2025
		 * 2025년은 평년입니다.
		 */
		
		//(0 == year %4) && (0 != year % 100) || (0 == year % 400)
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
		
		if((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}//main

}
