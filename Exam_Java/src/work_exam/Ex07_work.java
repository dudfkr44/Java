package work_exam;

import java.util.Random;

public class Ex07_work {

	public static void main(String[] args) {
//	난수로 생성된 배열 6개의 배열 값 중 arr에 담긴 값들 중 가장 큰 값을 출력
//	--------------
//	가장 큰 값 : 19

		Random rnd = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
				}
				
			}
		}
		
		
	} // main

}
