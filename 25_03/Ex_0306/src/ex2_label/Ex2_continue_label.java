package ex2_label;

public class Ex2_continue_label {
	public static void main(String[] args) {
		out:for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 10; j++) {
				
				if(j % 2 == 0) {
					continue out;
				}// if
				System.out.print(j + " ");
			}// inner
			System.out.println();
		}// outer
	} //main
}
