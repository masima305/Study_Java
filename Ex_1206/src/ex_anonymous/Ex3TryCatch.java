package ex_anonymous;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3TryCatch {
	public static void main(String[] args) {
		//Scanner �� ���������� �޾��� ���
		//�Է¹��� ���� �״�� ȭ�鿡 ���.
		//���� �̿��� ���� �Է� �޾Ҵٸ�
		//������ �Է��� �� �ֽ��ϴٶ�� �޽��� ����ϱ�.
		int n = -1;
		String input = new Scanner(System.in).next();
		try {
			int a = Integer.parseInt(input);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(input+"�� ������ �ƴմϴ�.");
			return;
		}
	}
}
