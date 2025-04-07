package exam_io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Exam {
	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt");
			fw.write(97);
			fw.write(65);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} // output
}
