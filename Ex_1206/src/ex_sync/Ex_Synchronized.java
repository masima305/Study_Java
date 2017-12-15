package ex_sync;

public class Ex_Synchronized implements Runnable{

	private int money = 10000;

	@Override
	public void run() {

		//��ũ�γ������ ������ ������ �ɶ����� �ٸ� �����忡�� �������� ���ϰ� �Ѵ�.
		synchronized (Ex_Synchronized.this){
						// ��or �׳� this��� �ᵵ ����

			for(int i = 0; i < 10 ; i++) {

				try {
					Thread.sleep(500);	
					withdraw(1000);
				} catch (Exception e) {
				}//TC
			}//for

		}


	}//run()

	public void withdraw(int m) {
		//���� �������� �������� �̸��� �����´�.
		String threadName = Thread.currentThread().getName();

		//�ܾ��� 0�� �̻��϶� ����Ҽ� �ְ� ��.
		if(getMoney() > 0) {

			money -= m;
			System.out.println(threadName + "�ܾ�"+money+"��");
		}else{
			System.out.println(threadName + "�ܾ׺���");
		}//if
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
