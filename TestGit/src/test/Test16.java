package test;

public class Test16 {
	public static void main(String[] args) {

//		변수 question에 ox값을 넣는다
//		OOXXO라면 1+ 2 + 0 + 0 + 1의 결과인 4.

		String question = "OOOOXXOXOO";
		int cnt = 0;
		int res = 0;

		for (int i = 0; i < question.length(); i++) {
			if (question.charAt(i) == 'O') {
				cnt++;
			} else {
				cnt = 0;
			}
			res += cnt;

		}
		System.out.println("결과값 : " + res);

	} // main
}
