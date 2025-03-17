package ex3_override;

public class Minus extends Calculator {

	@Override
	public int result(int n1, int n2) {
		return n1 - n2;
	}
}
