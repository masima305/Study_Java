package Ex_string;

import java.util.Scanner;

public class Ex5String {
	public static void main(String[] args) {
		// �̸����� �Է¹ް� ����� ���� ���� ���̰� 6���� �۰ų� 10���� Ŭ ��� �����޽��� ���.
		Scanner scanner = new Scanner(System.in);
		
		String email = scanner.next();
		String [] a = email.split("@");
		
		if (a[0].length() < 6 || a[0].length() > 10) {
			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
		}else{
			System.out.println("�α��� ����");
		
		}
	}
}
