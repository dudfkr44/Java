package ex8_objstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSave {
	public void writeInfo(User user) {

		String fullPath = MyPath.PATH + user.getTel().trim() + "/save.sav";
		File dir1 = new File(MyPath.PATH);

		if (!dir1.exists()) {
			dir1.mkdirs();
		}
		File dir2 = new File(dir1, user.getTel().trim());
		if (!dir2.exists()) {
			dir2.mkdirs();
		}

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(fullPath);
			oos = new ObjectOutputStream(fos);

			// user 클래스의 객체를 통째로 기록
			oos.writeObject(user);

		} catch (Exception e) {

			System.err.println("저장 실패");
			e.printStackTrace();

		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // writeInfo

}
