package work;

import java.util.Scanner;

public class Ex4_work {

	public static void main(String[] args) {
//		키보드에서 정수를 두 개 입력받아, 입력받은 두 수의 최대공약수를 구하기.
//		예) 4, 6을 입력받았다면 2
//		3과 7을 입력받았다면 "최대공약수가 없습니다"라는 문장을 선택
//		-------------
//		수1 : 4
//		수2 : 6
//		최대공약수는 2
			Scanner sc = new Scanner(System.in);
			System.out.print("수1 : ");
			int num1 = sc.nextInt();
			System.out.print("수2 : ");
			int num2 = sc.nextInt();
			int res = num1 > num2 ? num2 : num1;
			
	        for (int i = res; i >= 1; i--) {
	            if (num1 % i == 0 && num2 % i == 0) {
	            	res = i;
	            	break;
	            }
	        }
	        switch(res) {
	        case 1:
	        	System.out.println("최대공약수가 없습니다.");
	        	break;
	        default :
                System.out.println("최대공약수: " + res);
                break;
	        }
	}
}
