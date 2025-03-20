package Ex5_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		String path = "C:\\Users\\user1\\git\\Java";
		File f = new File(path);

		if (f.isDirectory()) {
			//폴더 안의 하위 요소들의 이름을 배열 구조로 모두 가져온다.
			String[] names = f.list();
			System.out.println();
			
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
				
			}
		}

	} // main
}
