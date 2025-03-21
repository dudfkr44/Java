package ex4_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) {
		String path = "C:\\Users\\user1\\git\\Java\\test.txt";
		File f = new File(path);
		FileReader fr = null;
		int uCnt = 0;
		int dCnt = 0;

		try {
			fr = new FileReader(f);
			int code;
			while ((code = fr.read()) != -1) { // 매 반복마다 code 업데이트
				if (code >= 'A' && code <= 'Z') {
					uCnt++;
				} else if (code >= 'a' && code <= 'z') {
					dCnt++;
				}
				System.out.print((char)code);
			}
			System.out.printf("\n대문자 : %d\n소문자 : %d\n", uCnt, dCnt);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}