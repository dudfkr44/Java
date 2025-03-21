package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test19 {
	// exam.txt의 내용이 회문인지 판단
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\exam.txt";
		String ori = "";
		String rev = "";

		File f = new File(path);
		byte[] read = new byte[(int) f.length()];

		FileInputStream fis = null;

		try {

			// fis가 읽어온 내용을 read[]에 담는다.
			fis = new FileInputStream(f);
			fis.read(read);

			// read[]의 값을 String 구조로 변환
			ori = new String(read);

			for (int i = ori.length() - 1; i >= 0; i--) {
				rev += ori.charAt(i);
			}
			
			if(ori.equalsIgnoreCase(rev)) {
				System.out.println(ori + " 문자열은 회문입니다.");
			} else {
				System.out.println(ori + " 문자열은 회문이 아닙니다.");
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
