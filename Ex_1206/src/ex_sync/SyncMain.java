package ex_sync;

public class SyncMain {
	public static void main(String[] args) {
		
		Ex_Synchronized atm = new Ex_Synchronized();
		
		Thread mom = new Thread(atm, "엄마");//뒤에 있는 인자로 쓰레드의 이름을 줄 수 있다.
		Thread son = new Thread(atm, "아들");
		
		//스레드 상속으로는 이렇게 구현할 수 없다,
		//러너블을 이용해야만 구현이 가능함.
		
		
		mom.start();
		son.start();
		
		
	}
}
