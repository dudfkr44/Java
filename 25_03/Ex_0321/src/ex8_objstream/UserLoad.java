package ex8_objstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserLoad {

	User user;

	public User loadInfo(String tel) {

		String path = MyPath.PATH + tel + "/save.sav";
		File f = new File(path);

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				// 저장된 정보를 user 객체에 넘김
				user = (User) ois.readObject();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("가져올 정보가 없습니다.");
		}

		return user;

	} // loadInfo

}
