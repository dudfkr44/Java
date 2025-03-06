package ex2_label;

public class Ex1_label_break {
	public static void main(String[] args) {
		
//		label : 특정 반복문에 이름을 지정하여 한 번에 두 개 이상의 반복문을 제어할 수 있도록 하는 기능
		out:for(int i = 1; i <= 2; i++) {
			
			
			for(int j = 1; j <= 10; j++) {
				
				if(j % 2 == 0) {
					break out;
				}// if			
				System.out.print(j + " ");
				
			}// inner
			
			System.out.println();
			
		}// outer
		
		
	} //main
}
