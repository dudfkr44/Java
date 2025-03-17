package ex6_abstract;

public abstract class Unit {
	String name;
	int energy;
	boolean fly;
	
//	자식 객체가 공격을 당했을 때 체력 감소량을 관리하기 위한 메서드
//	유닛마다 체력 감소량은 다를 수 있기 때문에 내용없이 추상 메서드로 정의
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
	
}
