package ex_sync;

public class SyncMain {
	public static void main(String[] args) {
		
		Ex_Synchronized atm = new Ex_Synchronized();
		
		Thread mom = new Thread(atm, "����");//�ڿ� �ִ� ���ڷ� �������� �̸��� �� �� �ִ�.
		Thread son = new Thread(atm, "�Ƶ�");
		
		//������ ������δ� �̷��� ������ �� ����,
		//���ʺ��� �̿��ؾ߸� ������ ������.
		
		
		mom.start();
		son.start();
		
		
	}
}
