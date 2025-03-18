package ex2_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int[] var = { 10, 20, 30 };
		try {
			for (int i = 0; i < var.length; i++) {
				System.out.println(var[i]);
			} // for

		} catch (Exception e) {

		}

		System.out.println("프로그램 종료");

	} // main
}
