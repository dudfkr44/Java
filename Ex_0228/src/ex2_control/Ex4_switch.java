package ex2_control;

public class Ex4_switch {
	public static void main(String[] args) {
		/* switch-case는
		 * 조건식이 아닌 값을 통해 원하는 결과를 도출하기 위한 제어문
		 */
		
		/* switch( 비교값 ) {
		 * 		case 조건값1:
		 * 			비교값과 조건값1이 일치할 때 실행되는 영역
		 * 		break;
		 *  	case 조건값2:
		 *			비교값과 조건값2이 일치할 때 실행되는 영역
		 *		break;
		 *		default:
		 *			비교값과 일치하는 조건값이 없을 때 실행되는 영역
		 *		break;
		 *}
		 */
		
		int n = 5;
		
		switch(n) {
		case 1: 
			System.out.println("1: 게임하기");
			break;
			
		case 2: 
			System.out.println("2: 설정하기");	
			break;
			
		case 3: 
			System.out.println("3: 종료하기");	
			break;
			
		default: 
			System.out.println("올바른 메뉴를 선택하세요.");
			break;
		}
	}//main
}
