package Ex6_bank;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("����", "02-3353-2242");
		Bank b2 = new Bank("�Ż�", "02-333-4444");
		//����ƽ ������ ��ü�� �������� �ʾƵ� ����� �� ����
		//���� �Ҵ�Ǵ°� �ƴϰ� static������ ���� �Ҵ��� �Ǳ� ������ �̹� �ν��Ͻ��� �����ϴ°���
		// ����ƽ ������ Ŭ������ ��� ���°� ������...
		//�׷��� ����� �����̺����� �Ⱦ�.
		
		
		Bank.interest = 0.5f;
		
		b1.info();
		b2.info();

	}
}
