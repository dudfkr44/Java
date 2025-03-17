package ex2_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("-----곰-----");
		System.out.println("눈 : " + bear.getEye() + "개");
		System.out.println("다리 : " + bear.getLeg() + "개");
		System.out.println("특징 : " + bear.woong);
		
		System.out.println("------------");
		
		Elephant elephant = new Elephant();
		System.out.println("----코끼리----");
		System.out.println("눈 : " + elephant.getEye() + "개");
		System.out.println("다리 : " + elephant.getLeg() + "개");
		System.out.println("특징 : " + elephant.nose);
		
		System.out.println("------------");
		
		Snake snake = new Snake();
		System.out.println("-----뱀-----");
		System.out.println("눈 : " + snake.getEye() + "개");
		System.out.println("다리 : " + snake.getLeg() + "개");
		System.out.println("특징 : " + snake.sensor);
		
		System.out.println("------------");
		
		Spider spider = new Spider();
		System.out.println("-----뱀-----");
		System.out.println("눈 : " + spider.getEye() + "개");
		System.out.println("다리 : " + spider.getLeg() + "개");
		System.out.println("특징 : " + spider.web);
	} // main
}
