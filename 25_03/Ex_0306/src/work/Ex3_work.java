package work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
//		키보드에서 정수를 두 개 입력받아, 입력받은 두 수의 최소공배수를 구하기.
//		예) 2, 5를 입력받았다면 10
//		4, 6을 입력받았다면 12
//		-------------
//		수1 : 4
//		수2 : 6
//		최소공배수는 12
		Scanner sc = new Scanner(System.in);
		System.out.print("수1: ");
		int num1 = sc.nextInt();
		System.out.print("수2: ");
		int num2 = sc.nextInt();
		
		for(int i = 1; ; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println("최소공배수: " + i);
				break;
			}
			
		}
		
		
		
	}
}
