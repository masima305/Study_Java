package ex3_thread;

public class ThreadMain {
	public static void main(String[] args) {
		ExThread th = new ExThread();
		th.start();
		//�������� run()�޼��带 ���������� ���� �����ϰ� �ϴ� �޼���.
		for (int i = 0; i < 10; i++) {
			System.out.println("���� ������ ������");
		}
		System.out.println("���� ������ ����");
	}
}
