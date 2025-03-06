package ex2_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {

		// 1 ~ 5사이의 난수
		int num = new Random().nextInt(5) + 1;// num 변수에서 난수 5개의 숫자의 숫자 중 1에서 5부터 시작하는 난수 출력
		System.out.println(num);
		System.out.println("--------------------");
		// 2 ~ 7사이의 난수
		num = new Random().nextInt(6) + 2;// ()괄호 안에는 시작부터 끝의 숫자의 갯수를 입력
		System.out.println(num);
		System.out.println("--------------------");
		// 2374 ~ 3130의 난수
		// num = new Random().nextInt(난수의 범위 + 1) + 시작수;
		// num = new Random().nextInt(끝 수 - 시작 수 + 1) + 시작수;
		num = new Random().nextInt(3130 - 2374 + 1) + 2374;
		System.out.println(num);
		System.out.println("--------------------");
		// 난수를 이용하여 대문자 A ~ Z 사이의 값 중 한 개를 무작위로 출력
		// --------------------
		// 결과 : U
		num = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("결과값 : " + (char)num);
	}
}
