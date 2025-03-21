package ex3_output;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_Print_Stream {
	public static void main(String[] args) {

		// 화면에 데이터를 출력하는 대표적인 클래스 : PrintStream
		PrintStream ps = System.out;

		String str = "안녕하세요.";

		try {
			//문자열 str 변수를 byte[] 구조로 변경하는 방법
			ps.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ps.write('A');

		ps.close();

	} // main
}
