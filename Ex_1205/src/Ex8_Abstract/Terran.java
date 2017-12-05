package Ex8_Abstract;

public class Terran extends Unit{
	
	public Terran(String name, int energy, boolean fly) {
		// TODO Auto-generated constructor stub
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy-=3;
		// TODO Auto-generated method stub
		
	}
}
