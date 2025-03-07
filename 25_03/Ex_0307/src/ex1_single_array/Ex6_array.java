package ex1_single_array;

import java.util.Scanner;

public class Ex6_array {
	public static void main(String[] args) {
//		키보드에서 입력받은 횟수만큼의 결과를 보여주는
//		피보나치의 수열을 만들기
//		------------------
//		길이 : 7
//		1 1 2 3 5 8 13
//		첫번째 숫자 + 두번째 숫자 = 세번째 숫자
		Scanner sc = new Scanner(System.in);
		System.out.print("피보나치의 수열의 길이 : ");
		int size = sc.nextInt();
		
		int[] fibo = new int[size]; // 입력받은 크기의 배열 생성

        // 초기값 설정
        if (size >= 2) {
        	fibo[0] = 1;
            fibo[1] = 1;
        } else {
        	System.out.println("최소 2 이상의 배열이어야 합니다.");
        	sc.close();
        	return;
        }
		
        for (int i = 2; i < size; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2]; // 이전 두 항의 합
        }

        // 수열 출력
        System.out.print("생성된 피보나치 수열: ");
        for (int num : fibo) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}