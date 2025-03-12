package ex3_method;

public class Calculator {
	public void calc(int n1, int n2, String op) {
		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("%d × %d = %d", n1, n2, n1 * n2);
			break;
		case "/":
			if (n2 > n1) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}
			System.out.printf("%d ÷ %d = %.1f", n1, n2, (float) n1 / (float) n2);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
			break;
		}
	}

}
