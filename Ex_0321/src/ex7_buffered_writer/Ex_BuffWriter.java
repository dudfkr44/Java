package ex7_buffered_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_BuffWriter {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\buffwriter예제.txt";
		File f = new File(path);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);

			bw.write("buffered writer의 예제예요.\n두 줄도 되지요.");
			bw.newLine();// \n 기능의 메서드 newLine
			bw.write("세번째 줄");

			// 작성할 내용을 물리적으로 기록
			bw.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // main
}
