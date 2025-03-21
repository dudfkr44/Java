package ex4_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java\\test.txt";
		File f = new File(path);

		FileReader fr = null;

		try {
			fr = new FileReader(f);
			int code;

			while ((code = fr.read()) != -1) {

				System.out.print((char) code);

			} // while

		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // main
}
