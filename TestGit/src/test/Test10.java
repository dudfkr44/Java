package test;

public class Test10 {
	public static void main(String[] args) {
	
//		1부터 15까지의 수를 나열하되 15번째 줄까지 출력하고
//		15의 위치를 순차적으로 표시
		
		for(int i = 1; i <= 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(i + j > 15) {
					 System.out.print(i + j - 15 + " ");
				}
				else {
					System.out.print(i + j + " ");
				}
			}
			System.out.println();
		}
	} // main
}
