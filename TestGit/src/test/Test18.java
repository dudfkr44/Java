package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test18 {
//	숫자를 입력하세요.(입력 종료 : 0)
//	45
//	17
//	20
//	21
//	0
//	원하는 숫자 범위를 입력하세요.
//	시작 : 15
//	끝 : 20
//	범위 내의 숫자들
//	17 20
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();

		System.out.println("숫자를 입력하세요.(입력 종료 : 0)");

		while (true) {
			int n = sc.nextInt();
			System.out.print("입력 : ");
			if (n == 0) {
				break;
			}

			arr.add(n);
		} // while
		
		int max = sc.nextInt();
		int min = sc.nextInt();
		
		if(min > max) {
			int temp = max;
			max = min;
			min = temp;
		}
			
			
			
		

		for (int result : arr) {
			if(result <= max && result >= min) {
				
			}

		}

	} // main
}
