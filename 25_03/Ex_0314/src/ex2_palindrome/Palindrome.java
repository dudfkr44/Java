package ex2_palindrome;

public class Palindrome {
	String rev = "";
	

	public void charCheck(String ori) {
		for(int i = ori.length() - 1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(ori)) {
			System.out.println("해당 문자열은 회문입니다.");
		} else {
			System.out.println("해당 문자열은 회문이 아닙니다.");
		}
		
	} // charCheck
	
	

}
