package ex4_break;

public class Ex3_break {
	public static void main(String[] args) {
	int num = 0;
	
	while(true) {
		switch(num) {
		case 1:
			System.out.println("1.메뉴: ");
			break;
			//반복문 내부에 switch문이 있다면
			//break를 만나도 반복문이 아닌 switch문만 빠져나갈 수 있다.
		case 2:
			System.out.println("2.설정: ");
			break;
		}//switch
		num++;
		}//while
	} //main

}
	
