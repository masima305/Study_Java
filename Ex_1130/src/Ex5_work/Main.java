package Ex5_work;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 0���� 9������ ������ 100�� ������.
		// �߻��� ������ �� �ڸ����� ���� ����ִ��� �׷���ȭ ��Ű����
		
		Random random = new Random();
		SaveData saver = new SaveData();
		ShowData shower = new ShowData();
		
		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(10);
			System.out.print(n);
			saver.save(n);
		}
		shower.show(saver.giveCount());
	}

}
