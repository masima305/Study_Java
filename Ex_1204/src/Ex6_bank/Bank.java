package Ex6_bank;

public class Bank {
	private String point;
	private String tel;
	static float interest;
	
	public Bank(String point, String tel){
		interest = 0.1f;
		this.point = point;
		this.tel = tel;
	}
	public void info() {
		System.out.println("����"+point);
		System.out.println("��ȭ��ȣ"+tel);
		System.out.println("����"+interest);
		System.out.println("---------------------------------");
	}
	
	
	
	
}
