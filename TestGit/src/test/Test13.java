package test;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
	
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
		System.out.print("학생 수 : ");
		int student = sc.nextInt();
		int[] arr = new int[student];
		int score = 0;
		int sum = 0;
		float avg = 0;
		int cnt = 0;
		
		
		for(int i = 0; i < student; i++) {
				score = new Random().nextInt(100) + 1;
				System.out.printf("학생%d의 성적 : %d\n", i + 1, score);
				sum += score;
			}
		
		System.out.println("-------------------------");
		avg = (float)sum / arr.length;
		System.out.printf("평균 점수: %.1f\n", avg);
		System.out.println("--- 평균 이상인 학생들 ---");
		
		for(int i = 0; i < student; i++) {
			if(score >= avg) {
				System.out.printf("----> 학생%d : %d점\n", i + 1, arr[i]);
				cnt++;
			}
			
		}
		System.out.printf("성적이 평균값을 넘은 학생 수 : %d명", cnt);
		
	}// main
	
	
}
