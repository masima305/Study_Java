
package ex8_deamon;

public class DaemonMain {
	public static void main(String[] args) {

		Save save = new Save();
		Thread t = new Thread(save);
		
		
		t.setDaemon(true);
		// t��� �����尡 ���󽺷������� ����ϴ� �޼���.
		// �ڽ��� ������ ���� �����尡 ����� �� �Բ� ����ȴ�.
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
		System.out.println("main���� ����");
	}
}
