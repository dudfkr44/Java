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

		FileInputStream fis = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(read);
				String str = new String(read);
				int sum = 0;
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (c >= '0' && c <= '9') {
						sum += (c - '0');
						// 또는: sum += Integer.parseInt(Character.toString(c)); // 복잡한 방법
					}
				}

				System.out.printf("각 숫자들의 합 : %d\n", sum);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	} // main
}