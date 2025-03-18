package ex2_exception;

public class Ex1_TryCatch {
	
	public static void main(String[] args) {
		
//		try-catch(예외 처리)
//		자바에서 JVM이 실행되는 도중 예외(에러)가 발생하면
//		그 시점에서 프로그램이 강제적으로 종료
		
		int result = 0;
		
		result = 10 / 0;
		
		System.out.println(result);
		
		
		
	} // main

}
