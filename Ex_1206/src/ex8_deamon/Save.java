package ex8_deamon;

public class Save implements Runnable{
	//특정 스레드를 종료하면 딸린 스레드들이 같이 종료되는 방식이 데몬쓰레드임.
	@Override
	public void run() {
		
		while (true) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("상태저장");
		}
	}
}
