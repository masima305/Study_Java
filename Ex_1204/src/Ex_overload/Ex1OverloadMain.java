package Ex_overload;

public class Ex1OverloadMain {
	/*
	 * 오버로딩은 메서드의 중복정의
	 * 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의 되는것을 말함.
	 * 오버로딩을 위한 메서드 명은 대소문자를 비롯하여 반드시 일치해야 한다.
	 * 
	 * 오버로딩을 위한 메서드명은 대소문자를 비롯하여 반드시 일치해야 한다.
	 * 인자들은 인자명을 제외한 인자의 수가 다르든, 인자의 수가 같다면 인자의 자료형이 다르든, 다은 메서드들과 인자타입이 다르게 정의되어야 한다
	 * 
	 * */
	
	public static void main(String[] args) {
		Ex1Overload over = new Ex1Overload();
		over.getResult();
		over.getResult(1);
		over.getResult((char)1);
		over.getResult("sss");
		over.getResult("sss",1);
		over.getResult(1,"sss");		
		System.out.println();
	}
}
