package Ex2_overload;

public class Bread {
	
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+n+"���� ���� ��������ϴ�.");
	}
	public void makeBread(String s ,int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s+"���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� "+n+"����"+s+" ���� ��������ϴ�.");
	}
	
	
}
