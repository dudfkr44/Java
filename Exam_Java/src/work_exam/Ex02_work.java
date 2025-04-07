package work_exam;

import java.util.Scanner;

public class Ex02_work {

	public static void main(String[] args) {
		//입력받은 달의 일수를 출력하는 메서드 구현
		//5월은 31일까지 있습니다.
		Scanner sc = new Scanner(System.in);
		

		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		int day = 0;
		
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
				break;
			case 2:
				day = 28;
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
				break;
			default:
				System.err.println("존재하지 않는 달입니다.");
		}
		sc.close();
	}//main
}
