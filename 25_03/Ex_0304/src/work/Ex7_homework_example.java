package work;

import java.util.Scanner;

public class Ex7_homework_example {

	public static void main(String[] args) {
		/*
		 * 피보나치 수열 만들기
		 * single for 문, swap 사용
		 * 1 1 2 3 5 8 13 21 ....
		 * 
		 * 반복횟수 : 입력값
		 */
	Scanner sc = new Scanner(System.in);
	int a = 1, b = 1; // 파보나치 행렬의 첫번째와 두번째 숫자 선정
	System.out.print("파보나치 수열을 표시할 숫자 개수: "); //입력할 숫자 앞에 표시
	int num = sc.nextInt();//파보나치 행렬을 표시할 숫자 갯수 입력
	System.out.print(a + " " + b + " ");//첫번째와 두번째 숫자를 표시
	
	for(int i = a + b; i < num; i++) {//조건식이 a와 b의 합이고, i가 입력한 숫자보다 작을 때 i의 값을 1 증가
		int next = a + b;//
		System.out.print(next + " ");
		a = b;
		b = next;
	}
		
		
	}
}