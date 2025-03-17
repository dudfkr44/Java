package ex6_abstract;

public class Protoss extends Unit {

	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	
	
	@Override
	public void decEnergy() {
		// TODO Auto-generated method stub
		energy--;

	}

}
