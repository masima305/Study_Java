package Ex_for;

public class ExSingleFor {
	public static void main(String[] args) {
		//for��, ���� for��/
		// Ư�� ����� ���ϴ¸�ŭ �ݺ������� ����ϰ��� �ϰ� ����. 
		for (int i = 0; i < args.length; ) {
			i++; // �̷��� �ε����� �ٱ����� �� �� ����. ���� if����  ���� �� ��� �������� ���Ե� while������ ����� �����ϴ�.
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(10-i);
		}
		for(int i = 15; i > 0; i--) {
			if (i%3 == 0) {
				System.out.println(i+"�� 3�� ����Դϴ�.");
			}
		}
		
		int dan = 7;
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("\n 7 * %d = %d",i,7*i);
		}
	}
}
