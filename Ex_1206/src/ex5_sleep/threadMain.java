package ex5_sleep;

public class threadMain {

	public static void main(String[] args) {
		ThreadSub t = new ThreadSub();
		t.start();
		
		try {
			Thread.sleep(3000);// 3�ʵ��� ������ ����.
		} catch (Exception e) {
			// TODO: handle exception
		}// ������ ������ �� ����ó���� ������� �Ѵ�.
		
		System.out.println("������");
	}
}
