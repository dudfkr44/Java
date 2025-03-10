package work;

import java.util.Scanner;

public class Ex1_homework {
	public static void main(String[] args) {
		
//		사용자가 현재 가지고 있는 돈을 입력받고, 크림빵, 새우깡, 콜라를 
//		잔돈을 하나도 남기지 않고 구입하는 경우의 수를 모두 출력하기. 
//		단, 사용하지 않는 상품이 있으면 안된다.
//		크림빵 500원, 새우깡 700원, 콜라 400원.
//
//		결과 :
//		당신이 소유한 금액 : 4000
//		크림빵 : 1개, 새우깡 : 1봉지, 콜라 : 7캔
//		크림빵 : 2개, 새우깡 : 2봉지, 콜라 : 4캔
//		크림빵 : 3개, 새우깡 : 3봉지, 콜라 : 1캔
//		크림빵 : 5개, 새우깡 : 1봉지, 콜라 : 2캔
//
//		---------------------------------

		int cream = 500;
		int shrimp = 700;
		int cola = 400;
		int money = 0;	
				
		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 소유한 금액 : ");
		money = sc.nextInt();
				
		for(int i = 1; money - i * cream > 0; i++){
					
			for(int j = 1; money - j * shrimp > 0; j++){
						
				for(int k = 1; money - k * cola > 0; k++){
							
					//가진돈과 사려는 조합의 금액이 같을경우
					if(money == 
					       i * cream + j * shrimp + k * cola){
						
						System.out.println("크림빵 : " + i + "					개, 새우깡 : " + j + "봉지, 콜라 : " + k + "캔");
								
					}	
				}//안쪽for				
			}//중간for
		}//바깥쪽 for
		sc.close();
	} // main
}
