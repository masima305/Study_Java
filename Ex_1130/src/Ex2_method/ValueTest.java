package Ex2_method;

public class ValueTest {
	
	
	public int test(String n) {
		System.out.println("메서드가 호출되었습니다.");
		return n.length();
	}
	
	public String method3(int n1, int n2) {
		String a=n1+"와"+n2+"가 들어옴";
		return a;
	}
	
}
