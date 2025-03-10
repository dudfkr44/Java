package ex1_multi_array;

public class Ex2_multi_arr {

	public static void main(String[] args) {

		char[][] arr = { { 'H', 'e', 'l', 'l', 'o' }, { 'J', 'a', 'v', 'a', '!' } };

//		arr[0][0] = 'H';
//		arr[0][1] = 'e';
//		arr[0][2] = 'l';
//		arr[0][3] = 'l';
//		arr[0][4] = 'o';
//		
//		arr[1][0] = 'J';
//		arr[1][1] = 'a';
//		arr[1][2] = 'v';
//		arr[1][3] = 'a';
//		arr[1][4] = '!';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			} // inner
			System.out.println("");
		} // outer

	} // main

}
