package ex3_thread;

public class ExThread extends Thread{
	@Override
	public void run() {
		// ���μ����� �������� ������ �����ϰ� ���ִ� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("������ ������");
		}
	}
}
