package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		ExThread th = new ExThread();
		th.start();
		//스레드의 run()메서드를 독립적으로 실행 가능하게 하는 메서드.
		for (int i = 0; i < 10; i++) {
			System.out.println("메인 스레드 구동중");
		}
		System.out.println("메인 스레드 종료");
	}
}
