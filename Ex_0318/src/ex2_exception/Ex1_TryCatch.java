package ex2_exception;

public class Ex1_TryCatch {

	public static void main(String[] args) {
//		try-catch(예외 처리)
//		자바에서 JVM이 실행되는 도중 예외(에러)가 발생하면
//		그 시점에서 프로그램이 강제적으로 종료
//		이것이 올바른 판단이지만 때로는 예상할 수 있는 오류에 대해
//		프로그램 종료 없이 작업을 이어나가야 할 때가 있다.
//		예외 처리를 통해 프로그램의 비정상적인 종료를 줄일 수 있다.

		int result = 0;
		int[] arr = { 1, 2, 3 };

		try {
			result = 10 / 0;
			arr[3] = 4;

		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("정수는 0으로 나눌 수 없어요.");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 없는 index로 접근하지 마세요.");

		} finally {
//			예외 유무에 관계없이 무조건 한 번 실행되는 영역
			System.out.println("finally");
		}

		System.out.println(result);

	} // main

}
