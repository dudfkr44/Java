package ex3_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
//		선 처리 후 비교
//		do {
//			처리영역
//		} while(조건식);

//		int i = 11;
//
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= 10);
//
//		System.out.println("----------------------------");

//		자바, JSP, Spring 시험을 봤다.
//		각 과목별 점수는 난수로 0 ~ 130점을 대입
//		난수로 만들어진 세 과목이 모두 0 ~ 100 범위의 값이라면
//		결과를 출력

		int java = 0, jsp = 0, spring = 0;
		
		do {
			java = new Random().nextInt(131);
			jsp = new Random().nextInt(131);
			spring = new Random().nextInt(131);
		} while (java > 100 || jsp > 100 || spring > 100);
		System.out.println("시험 결과");
		System.out.printf("자바 : %d점\n", java);
		System.out.printf("JSP : %d점\n", jsp);
		System.out.printf("스프링 : %d점\n", spring);

	}// main
}
