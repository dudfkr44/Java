package test;

public class Test08 {
	public static void main(String[] args) {
		int[] ar = new int[4];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = (i + 1) * 100 + 22;
			System.out.println(ar[i]);
		}
	} // main
}
