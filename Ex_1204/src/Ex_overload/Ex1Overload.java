package Ex_overload;

public class Ex1Overload {
	
	
	public void getResult() {
		System.out.println("인자가 없는 메서드");
		
	}
	public void getResult(int a) {
		System.out.println("인자가 int인 메서드");
	
	}
	public void getResult(char c) {
		System.out.println("인자가 char인 메서드");
	
	}
	public void getResult(String a) {
		System.out.println("인자가 String인 메서드");
	
	}
	public void getResult(String a,int s) {
		System.out.println("문자와 정수가 인자인 메서드");
	
	}
	public void getResult(int s, String a) {
		System.out.println("정수와 문자가 인자인 메서드");
	}
	
	
}
