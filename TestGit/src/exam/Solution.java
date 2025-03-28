package exam;

public class Solution {

	public static void main(String[] args) {

		int[] num_list = { 1, 2, 3, 4, 5 };
		int n = 3;

		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i] == n) {
				System.out.println(1);
				break;
			} else {
				continue;
			}
		}

	} // main
}
