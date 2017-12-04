package Ex5_work;

public class SaveData {
	
	private int m [] = new int [10];
	
	public void save(int n) {
		m[n] ++;
	}
	public int [] giveCount () {
		return m;
	}
	
}
