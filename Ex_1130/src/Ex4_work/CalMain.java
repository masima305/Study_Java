package Ex4_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Cal cal = new Cal();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A�� �Է����ּ���");
		int a = scanner.nextInt();
		System.out.println("B�� �Է����ּ���");
		int b = scanner.nextInt();
		System.out.println("������ �Է��� �ּ���");
		String c = scanner.next();
		
		System.out.println("��� : " + cal.getResult(a, b, c));
	
	}	

}
