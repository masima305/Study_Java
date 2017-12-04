package Ex6_bank;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("강남", "02-3353-2242");
		Bank b2 = new Bank("신사", "02-333-4444");
		//스테틱 변수는 객체를 생성하지 않아도 사용할 수 있음
		//힙에 할당되는게 아니고 static영역에 따로 할당이 되기 때문에 이미 인스턴스가 존재하는것임
		// 스테틱 변수는 클래스명 찍고 들어가는게 정석임...
		//그래서 얘들은 프라이빗으로 안씀.
		
		
		Bank.interest = 0.5f;
		
		b1.info();
		b2.info();

	}
}
