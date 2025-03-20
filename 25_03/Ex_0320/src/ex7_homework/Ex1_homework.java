package ex7_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex1_homework {
	public static void main(String[] args) {

//		exam.txt의 내용을 읽어서 숫자들의 합만 출력

		String path = "C:\\Users\\user1\\git\\Java\\exam.txt";

		File f = new File(path);
		byte[] read = new byte[(int) f.length()];

		if (f.exists()) {

			FileInputStream fis = null;

			try {
				fis = new FileInputStream(f);
				fis.read(read);

				String res = new String(read);
				int sum = 0;
				for (int i = 0; i < res.length(); i++) {
					char c = res.charAt(i);
					if (c >= '0' && c <= '9') {
						// ➊ 문자를 숫자로 변환 후 합산
						sum += c - '0'; // ASCII 코드 값 차이 이용
					}
				}
				System.out.println(res);
				System.out.println("숫자들의 합: " + sum);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	} // main
}