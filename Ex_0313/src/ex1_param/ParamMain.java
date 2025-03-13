package ex1_param;

public class ParamMain {
	public static void main(String[] args) {

		ParamTest pt = new ParamTest();
		int num = 100;
		pt.paramInt(num);
		System.out.println(num);

		
		
		
		String str = "홍길동, ";
		pt.paramString(str);
		System.out.println(str);
		
		int[] arr = {10};
		pt.paramArr(arr);
		System.out.println(arr[0]);
		
		//객체는 다른 클래스에 있는 메서드에 값을 넘기는 게 아니라 주소를 넘기기 때문에(단, String 객체는 불변의 법칙에 따라 그대로 나옴)
		//주소 안의 값을 공유해 출력 클래스에 출력될 때 메서드에서 기능을 거친 후의 값으로 변경되서 출력됨
		
	} // main
	
}
