package ex7_overload;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	} // makeBread - 1
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", n);
	} // makeBread - 2

	public void makeBread(int n, String name) {
		for(int i = 0; i < n; i++) {
			System.out.printf("%s을 만들었습니다.\n", name);
		}
		System.out.printf("요청하신 %d개의 %s을 만들었습니다.\n", n, name);
	} // makeBread - 3
}
