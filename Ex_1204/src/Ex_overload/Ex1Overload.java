package Ex_overload;

public class Ex1Overload {
	
	
	public void getResult() {
		System.out.println("���ڰ� ���� �޼���");
		
	}
	public void getResult(int a) {
		System.out.println("���ڰ� int�� �޼���");
	
	}
	public void getResult(char c) {
		System.out.println("���ڰ� char�� �޼���");
	
	}
	public void getResult(String a) {
		System.out.println("���ڰ� String�� �޼���");
	
	}
	public void getResult(String a,int s) {
		System.out.println("���ڿ� ������ ������ �޼���");
	
	}
	public void getResult(int s, String a) {
		System.out.println("������ ���ڰ� ������ �޼���");
	}
	
	
}
