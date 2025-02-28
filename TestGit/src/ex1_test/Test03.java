package ex1_test;
import java.util.Scanner;

public class Test03 {

/*
[문제 출제] - 성적 계산 및 평가 프로그램 (고정된 입력값 사용)
문제 설명
다음과 같이 국어, 영어, 수학 점수가 고정된 상태에서:

총점과 평균을 계산하세요.
평균 점수를 기준으로 등급(A, B, C, D, F)을 부여하세요.
등급 부여 기준은 다음과 같습니다.
90점 이상 → "A"
80점 이상 → "B"
70점 이상 → "C"
60점 이상 → "D"
60점 미만 → "F"
평균이 95점 이상이면 "우수 학생" 메시지를 출력하세요.
switch-case 문을 이용해 등급에 따른 메시지를 출력하세요.
"A" 등급 → "훌륭합니다!"
"B" 등급 → "좋아요!"
"C" 등급 → "괜찮아요!"
"D" 등급 → "노력이 필요합니다."
"F" 등급 → "재시험이 필요합니다."
*/
	
	public static void main(String[] args) {
	int korean = 90;
	int english = 75;
	int math = 85;
	int sum = korean + english + math;
	float avg = sum/3F;
	char grade;
	
	if(avg <=100 && avg >= 96) {
		grade = 'A';
		System.out.println();
	}
	
	if(avg <= 95 && avg >= 90) {
		grade = 'A';
	} if (avg <= 80 && avg > 90) {
		grade = 'B';
	} if (avg <= 70 && avg > 80) {
		grade = 'C';
	} if (avg <= 60 && avg > 70) {
		grade = 'D';
	} else {
		grade = 'F';
	}
		
	
	switch(grade) {
	case 'A': 
		System.out.println("\"" + grade + "\" 등급 → \"훌륭합니다!\"");
		
		break;
	case 'B': 
		System.out.println("추천 활동: 영화 감상");
		break;
	case 'C': 
		System.out.println("추천 활동: 영화 감상");
		break;
	case 'D': 
		System.out.println("추천 활동: 영화 감상");
		break;
	case 'F': 
		System.out.println("추천 활동: 영화 감상");
		break;
	default: 
		System.out.println("추천 활동: 영화 감상");
		break;
		
	}
}
