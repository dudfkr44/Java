package ex2_control;

public class Ex6_switch {
	
	public static void main(String[] args) {
		
		
		char last = '김';
		String result = "";
		
		/* switch문의 비교값으로는
		 * 정수(byte, short, int), 문자(char), 문자열(String)만 포함될 수 있다.
		 */
		switch(last) {//비교값
		case '김':
			result = "김씨로 등록된 인원수는 200만 명입니다.";
			break;
		case '이' :
			result = "이씨로 등록된 인원수는 144만 명입니다.";
			break;
		case '박' :
			result = "박씨로 등록된 인원수는 78만 명입니다.";
			break;
		default :
			result = "준비 중입니다.";
			break;
		}
		System.out.println(result);
		
	}

}
