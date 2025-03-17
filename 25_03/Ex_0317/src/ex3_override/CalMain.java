package ex3_override;

public class CalMain {
	public static void main(String[] args) {
		Plus plus = new Plus();
		Minus Minus = new Minus();
		Multi multi = new Multi();
		
		System.out.println("더하기 : " + plus.result(5, 3));
		System.out.println("빼기 : " + Minus.result(5, 3));
		System.out.println("곱하기 : " + multi.result(5, 3));
	} // main
}
