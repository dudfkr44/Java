package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {

//		배열은 '같은 자료형끼리 모아둔 묶음'이다.
//		효율적인 자료관리를 위해 '반드시' 알아둬야 한다.

		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int num4 = 400;
		System.out.println("----------------");

//		1) 배열 선언
		int[] arr;
//		2) 배열 생성
		arr = new int[6];
//		3) 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600;
//		arr[숫자] = 값; 숫자를 인덱스라 함

		for (int i = 0; i < arr.length; i++) {//arr.length는 방의 갯수
			System.out.println(arr[i]);
		} // for
	} // main
}
