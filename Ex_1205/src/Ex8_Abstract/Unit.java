package Ex8_Abstract;

public abstract
class Unit {
	String name;
	int energy;
	boolean fly;
	
	abstract public void decEnergy();

	public int getEnergy() {
		return energy;
	}
}
