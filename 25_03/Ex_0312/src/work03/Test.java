package work03;

public class Test {
	public void lcm(int n1, int n2) {

		int gcd = 1;

		if (n2 > n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}

		for (int i = 1; i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}

		int lcm = (n1 * n2) / gcd;

		System.out.printf("%d와 %d의 최대공약수는 %d\n", n1, n2, gcd);
		System.out.printf("%d와 %d의 최소공배수는 %d\n", n1, n2, lcm);

	}// leastC

}
