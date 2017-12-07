
package ex8_deamon;

public class DaemonMain {
	public static void main(String[] args) {

		Save save = new Save();
		Thread t = new Thread(save);
		
		
		t.setDaemon(true);
		// t라는 스레드가 데몬스레드임을 명시하는 메서드.
		// 자신을 생성한 메인 스레드가 종료될 때 함께 종료된다.
		t.start();

		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("main스레 종료");
	}
}
