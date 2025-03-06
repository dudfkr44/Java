package ex1_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
//		continue 문: 반복문 내에서 특정 코드를 건너뛰고자 할 때 사용하는 키워드
	
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++) {
				
				if(j % 2 == 0 ) {
//					가장 가까운 for문의 증감식으로 강제로 이동
					continue;
				}//2의 배수는 건너뜀
				System.out.print(j + " ");
			}// inner
			System.out.println();
		}// outer
		System.out.println("-------------------");
		
		for(int i = 1; i <= 2; i++) {

			for(int j = 1; j <= 5;) {
				
				if(j % 2 == 0) {
//					for 문에 증감식이 없다면 조건식으로 건너뜀
					continue;
				}//if
				j++;
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
		}//outer
	} //main
}
