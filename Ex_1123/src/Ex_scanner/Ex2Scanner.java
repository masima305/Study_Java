package Ex_scanner;

import java.util.Scanner;

public class Ex2Scanner {
	public static void main(String[] args) {
		//Ű���忡�� ���� 2���� �����ȣ�� �Է¹���. 
		//�Է� ���� ������ ������ ������ �Ʒ��� ���� ����� ����
		int a = 0;
		int b = 0;
		int r = 0;
		String c = null ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° :");
		a = scanner.nextInt();
		System.out.print("�ι�° :");
		b = scanner.nextInt();
		System.out.print("������ :");
		c = scanner.next();
		
		
		switch (c) {
		case "+":
			r = a + b;
			System.out.printf("%d + %d = %d", a,b,r);
			break;
		case "-":
			r = a - b;
			System.out.printf("%d - %d = %d", a,b,r);
			break;

		case "*":
			r = a * b;
			System.out.printf("%d * %d = %d", a,b,r);
			break;
		case "/":
			
			r = a / b;
			System.out.printf("%d / %d = %d", a,b,r);
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			break;
		}
		
		scanner.close();
		
	}
}
