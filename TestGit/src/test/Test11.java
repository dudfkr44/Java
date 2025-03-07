package test;

import java.util.Random;

public class Test11 {
	public static void main(String[] args) {
		int[] lotto = new int[6];// 정수형의 lotto라는 이름의 배열을 6개 만듬
		for (int i = 0; i < lotto.length; i++) {// 조건 변수 i가 배열 변수 lotto의 크기 만큼 반복해서 집어넣게 설정
			int randomNum = 0;// 난수를 넣고 비교할 변수 설정
			boolean isDuplicate; // 난수와 비교 숫자가 같을 경우와 다를 경우의 기능을 분산해서 처리할 논리 연산자 설정
			do {
				randomNum = new Random().nextInt(45) + 1;// 1부터 45까지의 난수 하나를 randomNum 변수에 넣음
				isDuplicate = false;// false로 설정된 do의 부분 반복 실행
				for (int j = 0; j < i; j++) {// 중복 숫자 판별해서 반복 실행할 for문
					if (lotto[j] == randomNum) {// 반복해서 실행할 조건 숫자와 난수가 설정된 숫자가 같다면
						isDuplicate = true;// 논리연산자를 true로 설정해 해당 반복 구간 건너뛰고 do 문을 빠져나오게 만듬
						break;// 가장 가까운 상위의 for문으로 이동
					} // 중복 비교 if문
				} // 중복 숫자를 반복으로 실행할 for문
			} while (isDuplicate);// isDuplicate가 true가 된 상태가 되면 이쪽 이후로 빠져 나옴
			lotto[i] = randomNum;// 중복이 안 된 숫자에 lotto 배열의 공간에 값을 순차적으로 집어넣음
		} // 판별 및 난수 입력 for문

		System.out.print("로또 번호 : ");
		for (int num : lotto) {// 배열 변수 lotto에 든 값을 정수형 변수 num에 집어넣음
			System.out.print(num + " ");
		} // 배열 변수 lotto의 값을 담은 숫자를 담은 정수형 변수 num을 순차적으로 전부 출력
	} // main
}
