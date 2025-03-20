package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

//		이름 : hong
//		나이 : 12
//		hong / 12
//		이름 : kim
//		나이 : 22
//		hong / 12
//		kim / 22

		List<User> arr = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			User u = new User();
			System.out.print("이름 : ");
			u.setName(sc.next());
			System.out.print("나이 : ");
			u.setAge(sc.nextInt());

			arr.add(u);

//			for (int i = 0; i < arr.size(); i++) {
//				System.out.println(arr.get(i).getName() + " / " + arr.get(i).getAge());
//
//			}
			
			for(User n : arr) {
				System.out.println(n.getName() + " / " + n.getAge());
			}

		}

	} // main
}
