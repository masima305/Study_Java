package ex8_deamon;

public class Save implements Runnable{
	//Ư�� �����带 �����ϸ� ���� ��������� ���� ����Ǵ� ����� ���󾲷�����.
	@Override
	public void run() {
		
		while (true) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("��������");
		}
	}
}
