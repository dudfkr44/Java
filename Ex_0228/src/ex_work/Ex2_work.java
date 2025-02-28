package ex_work;

public class Ex2_work {

	public static void main(String[] args) {

		//5월은 31일까지 있습니다.
		
		int month = 13;
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지입니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일까지입니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지입니다.");
			break;
			
		default :
			System.out.println(month +"월은 존재하지 않는 달입니다.");
		}//switch
		
		
	}//main
}
