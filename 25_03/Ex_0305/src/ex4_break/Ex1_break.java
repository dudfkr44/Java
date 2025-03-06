package ex4_break;

public class Ex1_break {
	public static void main(String[] args) {
		
//		break 문 : 반복문 내에서 갖아 가까운 반복문을 빠져나갈 때 쓰는 메서드
		
		
		for(int i = 1; i <= 2; i++ ) {
			for(int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					//가장 가까운 반복문을 강제로 탈출
					break;
					//System.out.println();
				}//if
				System.out.print(j + " ");
			}//inner
				System.out.println();
		}//outer
		
		
		
		
	}//main
}
