package ex4_thread;

public class ThreadSub2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("������1");
		}
	}
}
