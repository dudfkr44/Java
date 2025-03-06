package test;

import java.util.Scanner;

public class Test06 {
//
//📌 문제: 숫자 다이아몬드 출력
//사용자로부터 **양의 정수 N**을 입력받아, 아래와 같은 숫자 다이아몬드 모양을 출력하는 프로그램을 작성하세요.
//단, 이중 for문을 사용하여 구현해야 합니다.
//
//🔹 조건
//입력값 N은 다이아몬드의 최대 너비(중앙 행의 숫자 개수).
//숫자가 1부터 증가하며 다이아몬드 형태로 출력됨.
//이중 for문을 사용하여 해결.
//🔹 입력 예시
//복사
//편집
//숫자 다이아몬드의 최대 너비 입력: 5
//🔹 출력 예시
//    1    
//   1 2   
//  1 2 3  
// 1 2 3 4 
//1 2 3 4 5
// 1 2 3 4 
//  1 2 3  
//   1 2   
//    1    
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드를 입력할 최대 정수: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i + 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
        for (int i = num - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // 숫자 출력
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
		sc.close();
	}

}
