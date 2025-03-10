package ex1_multi_array;

public class Ex3_multi_arr {

	public static void main(String[] args) {

		String[][] students = { { "이름", "자바", "JSP" }, { "김길순", "100", "87" }, { "홍길동", "50", "70", "98" } };

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				System.out.print(students[i][j] + "\t");
			} // inner
			System.out.println();
		} // outer
		

	} // main
}
