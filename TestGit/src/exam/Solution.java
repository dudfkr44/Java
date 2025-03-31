package exam;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

//		한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 result 값에 담으세요.

		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("정수 입력 : ");
		String num_str = sc.next();
		Integer.parseInt(num_str);
		int result = sum_Digit(num_str);
		
		System.out.println("결과값 : " + result);

	} // main

	private static int sum_Digit(String num_str) {
		// TODO Auto-generated method stub
		return 0;
	}

}
