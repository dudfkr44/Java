package ex6_overload;

public class OverMain {
	public static void main(String[] args) {
		Over ov = new Over();
		ov.result();
		ov.result(1);
		ov.result('a');
		ov.result(5, "aas");
		ov.result("ass", 5);
	} // main
}
