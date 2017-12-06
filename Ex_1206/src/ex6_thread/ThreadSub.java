package ex6_thread;

public class ThreadSub extends Thread{
	private int n;
	
	public void setN(int n) {
		this.n= n;
	}
	public void run() {
		for (int i = 0; i < n; i++) {
			try {
				System.out.println(n-i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Á¾·á");
	}
}
