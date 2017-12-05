package Ex_override;

public class Animal {
	//모든 동물들이 공통적으로 갖는 특징
	
	private int leg;
	private String shout;
	
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public String getShout() {
		return shout;
	}
	public void setShout(String shout) {
		this.shout = shout;
	}
	
}
