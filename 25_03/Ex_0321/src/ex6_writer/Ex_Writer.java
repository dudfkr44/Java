package ex6_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_Writer {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\fileWriter예제.txt";
		File f = new File(path);
		FileWriter fw = null;

		try {

			fw = new FileWriter(f);

			String str = "나는 FileWriter의 예제입니다.\n두 줄도 쓸 수 있어.";
			fw.write(str);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // main
}
