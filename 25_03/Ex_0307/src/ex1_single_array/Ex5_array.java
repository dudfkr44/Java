package ex1_single_array;

public class Ex5_array {
	public static void main(String[] args) {

//		배열 nArr에 담긴 모든 값의 합을 출력
		int[] nArr = { 11, 7, 21, 14, 9 };
		int sum = 0;

		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i] == 9) {
				sum += nArr[i];
				System.out.print(nArr[i] + " = ");
			} else {
				sum += nArr[i];
				System.out.print(nArr[i] + " + ");
			}
		}

		System.out.println(sum);
		System.out.println("------------------");
		
		
		int res2 = 0;
		for(int n : nArr) {
			res2 += n;
		}
		
		System.out.println(res2);
		
	} // main
}
