package Ex_continue;

public class ExContinue {
	//continue�� : �ݺ��� ������ Ư�� ������ �ǳʶٰ��� �� �� ����ϴ� ����.
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
					//��ƾ�� ������ �Ʒ��ʿ� �ִ� �ڵ�� �������� �ʰ� �ٷ� �״��� ��ƾ���� ����.
				}
				
				System.out.printf("%d", j);
				
			}
			
			System.out.println();
		}
	}
}
