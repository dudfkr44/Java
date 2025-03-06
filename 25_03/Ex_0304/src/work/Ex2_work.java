package work;
import java.util.Scanner;

public class Ex2_work {
	
	//수1 : 11
	//수2 : 50
	//연산자 : +
	//11 + 50 = 60
	
	public static void main(String[] args) {

		System.out.print("수1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("수2: ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, -, *, /, %): ");
		String op = sc.next();
		int result;
		
		switch(op) {

		case "+":
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		break;
		
		case "-":
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		break;
		
		case "*":
		result = num1 * num2;
		System.out.println(num1 + " × " + num2 + " = " + result);
		break;
		
		case "/":
		result = num1 / num2;
		System.out.println(num1 + " ÷ " + num2 + " = " + result);
		break;
		
		case "%":
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		break;
		
		default :
		System.out.println("계산할 수 없는 연산자입니다. 프로그램을 종료합니다.");
		return; //프로그램 종료하는 메서드
		}
	}
}
