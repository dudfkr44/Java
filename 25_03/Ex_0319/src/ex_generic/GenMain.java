package ex_generic;

public class GenMain {
	public static void main(String[] args) {

		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("abc");
		String s1 = v1.getValue();
		System.out.println(s1);

		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		int num = 100;
		// 기본자료형(int) -> 클래스(Integer) : auto boxing
		v2.setValue(num);

		// 클래스(Integer) -> 기본자료형(int) : unboxing
		int n1 = v2.getValue();
		System.out.println(n1);

	} // main
}
