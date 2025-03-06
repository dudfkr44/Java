package ex2_control;

public class Ex5_switch {

	public static void main(String[] args) {
		
		String res = "C";
		String fin = "";
		
		switch(res) {//비교값
		case "A" :
			fin = "90 ~ 100";
		break;
		
		case "B" :
			fin = "80 ~ 89";
		break;
		
		case "C" :
			fin = "70 ~ 79";
			break;
	
		case "D" :
			fin = "60 ~ 69";
		break;
	
		case "F" :
			fin = "0 ~ 59";
			break;
		default :
			fin = "잘못된 점수입니다.";
		break;
		}//switch
		
		System.out.println(fin);
		
		
	}// main
}
