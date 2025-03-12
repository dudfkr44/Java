package work02;

public class PrimeNum {// Class B
	public void iam_prime(int n) {

		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		} // for

		if (cnt == 1) {
			System.out.println(n + " : 소수");
		} else {
			System.out.println(n + " : 안소수");
		}
	}
}
