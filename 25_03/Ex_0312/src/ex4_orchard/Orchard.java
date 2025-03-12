package ex4_orchard;

public class Orchard {

	public void result(int apple, int pear, int orange) {
		
		System.out.println("사과 :" + apple + "개");
		System.out.println("배 :" + pear + "개");
		System.out.println("오렌지 :" + orange + "개");
		
		int sum = apple + pear + orange;
		System.out.printf("하루의 총 생산량은 %d개입니다.", sum);
		float avg = sum/24f;
		System.out.printf("시간당 평균 생산량은 %.1f개입니다.", avg);
	}
	
	
}
