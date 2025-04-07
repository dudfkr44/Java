package work_exam;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex06_work {
	public static void main(String[] args) {

//		키보드에서 입력받은 정수가 소수인지 아닌지를 판단하세요.
//		-----------------
//		입력 : 7
//		7은(는) 소수입니다.
//		입력 : 4
//		4은(는) 소수가 아닙니다.
//		소수 : 1과 자기 자신으로 밖에 나눌 수 없는 양의 정수

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num > 1 && IntStream.range(2, (int)Math.sqrt(num) + 1).noneMatch(i -> num % i == 0)) {
			System.out.printf("%d는 소수입니다.", num);
		} else {
			System.out.printf("%d는 소수가 아닙니다.", num);
		}
			
		sc.close();
	} // main

}
