package ex6_abstract;

public class Zerg extends Unit {

	public Zerg(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		// TODO Auto-generated method stub
		energy -= 4;

	}

}
