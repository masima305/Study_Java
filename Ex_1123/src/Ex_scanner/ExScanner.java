package Ex_scanner;

import java.util.Scanner;

public class ExScanner {
	// Ű���忡�� ���� �ޱ� ���� Scanner Ŭ����
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.println("������ �Է�");
		String str = scanner.next();
		System.out.println(str);
		
		String strln = scanner.nextLine();
		System.out.println(strln);
		
		scanner.close();
		
		
		
	}
}
