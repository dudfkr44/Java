package ex7_homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_homework {
	public static void main(String[] args) {

		// exam.txt의 내용이 회문인지 판단

		String path = "C:\\Users\\user1\\git\\Java\\exam.txt";

		File f = new File(path);
		byte[] read = new byte[(int) f.length()];

		if (f.exists()) {

			FileInputStream fis = null;

			try {
				fis = new FileInputStream(f);
				fis.read(read);

				String res = new String(read);
				String ori = res;
				String rev = "";
				for (int i = ori.length() - 1; i >= 0; i--) {
					rev += ori.charAt(i);
				}

				if (ori.equals(rev)) {
					System.out.println(ori + "는 회문입니다.");
				} else {
					System.out.println(ori + "는 회문이 아닙니다.");
				}

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