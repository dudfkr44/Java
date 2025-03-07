package week_exam;

import java.util.Random;

public class Ex3_week {
	public static void main(String[] args) {
		int month = new Random().nextInt(12) + 1;
		int day = 31;
		
		switch(month) {
		case 2:
			day -= 3;
			break;
		case 4: case 6: case 9: case 11:
			day -= 1;
			break;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, day);
	} // main
}
