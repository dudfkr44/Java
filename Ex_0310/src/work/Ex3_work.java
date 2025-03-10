package work;

import java.util.Random;
import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

//		입력받은 학생 수를 출력
//		학생 수 : 3명
//		학생1의 성적 : 90
//		학생2의 성적 : 75
//		학생3의 성적 : 84
//		--------------------
//		평균 성적 : 83.0
//		--- 평균 이상인 학생들 ---
//		-> 학생1
//		-> 학생3
//		평균 이상인 학생 수 : 2명
		Scanner sc = new Scanner(System.in);
		System.out.print("학생들 수 입력: ");
		int studentCnt = sc.nextInt();
		int[] grade = new int[studentCnt];

		System.out.printf("학생 수: %d명\n", grade.length);
		for (int i = 0; i < grade.length; i++) {
			grade[i] = new Random().nextInt(101) + 1;
			System.out.printf("학생%d: %d\n", i + 1, grade[i]);
		}

		System.out.println("-------------");
		int sum = 0;
		for (int n : grade) {
			sum += n;
		}
		float avg = (float) sum / grade.length;
		System.out.printf("평균 성적: %.1f\n", avg);
		System.out.println("---점수가 평균 이상인 학생들---");
		int cnt = 0;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] >= avg) {
				cnt++;
				System.out.printf("--> 학생 %d : %d\n", i + 1, grade[i]);
				System.out.printf("평균 이상인 학생 수 : %d", cnt);
			}
		}
		sc.close();
	} // main
}
