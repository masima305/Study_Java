package Ex8_Abstract;

public class Main {
	public static void main(String[] args) {
		Terran t1 = new Terran("����", 4000, false);
		Terran t2 = new Terran("����", 10000, false);
		Protos p1 = new Protos("����", 6000, false);
		Zerg z1 = new Zerg("�����", 200, false);
		
		t1.decEnergy();
		t2.decEnergy();
		
		System.out.println(t1.getEnergy());
		System.out.println(t2.getEnergy());
		
	}
}
