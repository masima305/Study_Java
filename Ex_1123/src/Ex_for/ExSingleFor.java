package Ex_for;

import java.util.Scanner;

public class ExSingleFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("���� �Է��ϼ���");
		int dan = scanner.nextInt();
		if (dan > 9 || dan < 2) {
			System.out.println("2~9������ ���� �Է��� �� �ֽ��ϴ�.");
		}else {
			for(int i = 1; i < 10 ; i++) {
				System.out.printf("\n %d * %d = %d",dan,i,dan*i);
			}
		}
	}
}
