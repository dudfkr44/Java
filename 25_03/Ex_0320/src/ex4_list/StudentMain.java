package ex4_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {

//		학생들의 이름, 국어, 영어, 수학 성적을 저장하고
//		아래와 같은 결과를 출력하시오.
//		---------------
//		학생 수 : 2
//		이름 : hong
//		국어 : 99
//		영어 : 87
//		수학 : 84
//		---------------
//		이름 : park
//		국어 : 75
//		영어 : 97
//		수학 : 80
//		---------------
//		hong - 국어 : 99, 영어 : 87, 수학 : 84, 총점 : 270, 평균 : 98.0
//		hong - 국어 : 75, 영어 : 97, 수학 : 80, 총점 : 252, 평균 : 84.0

		List<Student> arr = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		System.out.print("총 학생 수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			Student st = new Student();
			System.out.print("이름 : ");
			st.setName(sc.next());
			System.out.print("국어 : ");
			st.setKor(sc.nextInt());
			System.out.print("영어 : ");
			st.setEng(sc.nextInt());
			System.out.print("수학 : ");
			st.setMath(sc.nextInt());
			arr.add(st);
		}

		for (Student n : arr) {
			System.out.printf("%s - 국어 : %d점, 영어 : %d점, 수학 %d점, 총점 : %d점, 평균 : %.1f점\n", 
					n.getName(), n.getKor(), n.getEng(), n.getMath(), n.getSum(), n.getAvg());
		}
		sc.close();
	}
}
