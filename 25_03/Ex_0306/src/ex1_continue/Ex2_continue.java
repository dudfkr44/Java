package ex1_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n = 1;

		while (n < 5) {
			n++;
			if (n % 3 == 0) {
//				while 문 안의 continue는 가까운 while 문의 조건식으로 건너뛴다.
				continue;
			}
			System.out.println(n);

		}

		System.out.println("-------------------");

		int num = 0;

		while (num <= 10) {
			num++;
			switch (num) {
			case 1:
				System.out.println("hi");
				continue;
			case 3:
				System.out.println("hello");
				continue;
			case 5:
				System.out.println("bye");
				continue;
			}// switch
			System.out.println("나는??");
		}// while
	} // main
}
