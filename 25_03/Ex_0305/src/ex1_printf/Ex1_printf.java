package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {
/* 자바의 출력 코드
 * int age = 30;
 * 이스케이프 코드
 * \n : 강제 개행
 * \t : 문자열 탭 간격 Tab키 만큼의 간격 확보 (문자 정렬 기능)
 * \\ : \(역슬러쉬)를 그대로 표현
 * \’ : ‘(작은따옴표: single quotation) 그대로 표현
 * \” : “(큰따옴표: Double quotations) 그대로 표현
 * \r : 캐리지 반환 (줄 바꿈 문자, 현재 커서를 가장 앞으로 이동)
 * \f : 폼 피드 (줄 바꿈, 현재 커서에서 다음 줄로 이동)
 * \a : 벨 소리
 * \b : 백 스페이스
 * \000 : Null
 * 
 * formatter의 자료형
 * %d : 정수형 자료 예) 3
 * %f : 실수형 자료 예) 27.500000
 * %.1f : 실수형 자료 소수점 한 자리까지 표시 예) 2.5
 * %c : 문자형 자료 예) '양', '길', 'A'
 * %b : 논리형 자료 (참, 거짓 - boolean) 예) true, false
 * %s : 문자열 자료 String 예) "문자열"
 * %02d : 정수형 자료 2자리로 표현 예) 20, 03
 * %% : % 표시
 */
		int age = 30;
		System.out.println("내 나이는 " + age + "살 입니다.");
		System.out.printf("내 나이는 %d살 입니다.\n", age);//정수 표시 %d, \n : 강제 개행
		System.out.println("-------------------------");
		System.out.printf("나는 %dcm이고, %d살이야.\n", 175, 23);//정수 표시
		System.out.println("-------------------------");
		System.out.printf("오늘 기온은 %f도 입니다.\n", 27.5);//실수 표시 %f
		System.out.printf("내 시력은 %.1f이야.\n", 2.0);//소수점 한 자리 표시 %.1f
		System.out.printf("빨간 사탕은 %d개고, 파란 사탕은 %.1f개야.\n", 2, 3.1);
		System.out.println("-------------------------");
		System.out.printf("국어 성적: %c\n", '양');
		System.out.println("-------------------------");
		System.out.printf("참: %b, 거짓: %b\n",true ,false);
		System.out.println("-------------------------");
		System.out.printf("%s는 %02d살이다.\n","사랑이", 9);
		System.out.println("-------------------------");
		System.out.printf("상위 %d%% 입니다.\n", 20);
		System.out.printf("홍길동\t부대표\n");
		System.out.printf("고수\t부대표\n");
	}
}
