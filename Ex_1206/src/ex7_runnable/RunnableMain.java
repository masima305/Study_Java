package ex7_runnable;

public class RunnableMain {
	public static void main(String[] args) {
		RunnableTest r = new RunnableTest();
		Thread t = new Thread(r); //���ʺ��� ������ ���ο� �����带 ���� ����־������.
		//���ʺ�� ���� ��쿡 ����� ���� ������� �ʾұ⶧����
		//���� �����Ͷ� ��ȸ�� �ϳ� �� ������ �� ����.
		
		t.start();
	}
}
