package ex3_override;

public class Multi extends Calculator {

	@Override
	public int result(int n1, int n2) {
		return n1 * n2;
	}
}
