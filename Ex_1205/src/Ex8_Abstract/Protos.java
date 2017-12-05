package Ex8_Abstract;

public class Protos extends Unit{
	
	public Protos(String name, int energy, boolean fly) {
		// TODO Auto-generated constructor stub
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy--;
		// TODO Auto-generated method stub
		
	}
}
