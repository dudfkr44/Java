package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {
		int[] arr = new int[3];//new로 선언하는 변수는 heap 메모리에 저장, 일반 변수는 stack 메모리에 저장
//		arr[0] = 10;
//		arr[1] = 11;
//		arr[2] = 12;
//		배열의 존재하지 않는 index에 접근하는 것은 불가능
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 10;
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
//		개선된 루프(향상된 for 문)
//		편리하지만, 배열의 각 인덱스에 대한 IF 제어문을 이용한 출력값 제어가 불가(전체 출력만 가능)
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
	} // main

}
