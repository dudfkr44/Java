package ex1_test;

import java.util.Scanner;

/*
문제 설명:
사용자로부터 양의 정수(예: 5)를 입력받은 후, 입력된 수 만큼의 줄에 걸쳐 별(*)로 구성된 피라미드를 출력하는 프로그램을 작성하세요.
피라미드는 다음과 같이 출력되어야 합니다. (예를 들어 입력 값이 5일 경우)

    *
   ***
  *****
 *******
*********
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int number = sc.nextInt();//입력변수 number 선언
        
        // number 줄의 피라미드 출력
        for (int line = 1; line <= number; line++) {
            // 공백 출력: number - line 개
            for (int space = 1; space <= number - line; space++) {
                System.out.print(" ");
            }
            // 별 출력: 2 * line - 1 개
            for (int star = 1; star <= (2 * line - 1); star++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
        sc.close();
    }
}