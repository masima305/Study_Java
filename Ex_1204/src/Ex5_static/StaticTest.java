package Ex5_static;

public class StaticTest {
	String str1 = "일반 멤버변수";
	static String str2 = "스테틱변수";
	
	
	public static String getResult2(){
		
		//스테틱 메서드 내부에서는 static변수만 접근가능.
		return str2;
	}
	public String getResult() {
		return str2;
	}
	
}
