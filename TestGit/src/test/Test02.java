package test;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일을 입력하세요: ");
        String day = scanner.next();  // 사용자 입력 받기
        scanner.close();  // Scanner 닫기
		
		switch(day) {
		case "월":
			System.out.println("추천 활동: 독서하기");
			break;
		case "화":
			System.out.println("추천 활동: 운동하기");
			break;
		case "수":
			System.out.println("추천 활동: 영화 감상");
			break;
		case "목":
			System.out.println("추천 활동: 근육 운동");
			break;
		case "금":
			System.out.println("추천 활동: 지난 주일 활동 작성");
			break;
		case "토": case "일": 
			System.out.println("휴무");
			break;
		default :
			System.out.println(day + "요일은 존재하지 않습니다.");
			System.out.println("맞지 않는 요일입니다.");
			break;
		}
		
	}
}
