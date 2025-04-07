package practice;

class Solution {
	public int solution(String binomial) {
		int answer = 0;
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int num1 = 0;
		int num2 = 0;
		boolean opFound = false;
		char op = ' ';

		for (char c : binomial.toCharArray()) {
			if (!opFound) {
				if (c == ' ') {
					continue;
				}
				if (c == '+' || c == '-' || c == '+') {
					opFound = true;
					op = c;
				} else {
					sb1.append(c);
				}

			} else {
				opFound = true;
				if (c == ' ') {
					continue;
				} else {
					sb2.append(c);
				}
			} // opFound else
		} // for

		num1 = Integer.parseInt(sb1.toString());
		num2 = Integer.parseInt(sb2.toString());
		
		switch(op) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		}

		return answer;
	}
}