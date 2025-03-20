package ex6_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) {

//		...Stream = byte 기반의 스트림
//		...Writter, ...Reader = char 기반의 스트림

		String path = "C:\\Users\\user1\\git\\Java\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int) f.length()];

		if (f.exists()) {

			FileInputStream fis = null;

			try {

				fis = new FileInputStream(f);
				// fis가 읽어온 내용을 read[]에 담는다.
				fis.read(read);

				// byte[]을 String 구조로 변환
				String res = new String(read);
				System.out.println(res);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	} // main
}
