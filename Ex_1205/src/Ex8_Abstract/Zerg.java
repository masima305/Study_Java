package Ex8_Abstract;

public class Zerg extends Unit{
	
	public Zerg(String name, int energy, boolean fly) {
		// TODO Auto-generated constructor stub
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 10;
		// TODO Auto-generated method stub
		
	}
}
