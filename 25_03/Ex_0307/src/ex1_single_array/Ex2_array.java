package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		int[] ar = new int[3];
//		ar[0] = 100;
//		ar[1] = 200;
//		ar[2] = 300;
		

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (i + 1) * 100;
			System.out.println(ar[i]);
		} // for
		System.out.println("----------------");
		
//		int[] numArr = new int[3];
//		numArr[0] = 30;
//		numArr[0] = 32;
//		numArr[0] = 65;
		
		int[] numArr = {30, 32, 65};//배열 선언, 생성, 초기화 골프 코드
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	} // main
}
