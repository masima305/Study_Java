package Ex_string;

import java.util.Scanner;

public class Ex1String {
	public static void main(String[] args) {
		//Ŭ�����߿��� ��ǥ���̶�� �� �� �ִ� string Ŭ����
		// String Ŭ������ �ΰ��� Ư¡�� �ִ�.
		// 1)��ü �������� �ΰ���(�Ͻ���, �����)
		// 2)�� �� ������ ���ڿ��� ������ ������ �ʴ´�.
		
		String s1 = "abc";
		String s2 = "abc";
		// �⺻ �ڷ������� ���� ��������,
		// Ŭ������ ����ϴ� �͵��� �ּҰ����� ���Ѵ�.
		//-> �Ͻ��� ��ü����.
	
		if(s1 == s2){
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ�");
		}
		
		System.out.println("------------------------------------------------");
		
		String s3 = new String("abc"); // new Ű���尡 ���Ǹ� ����� ��ü����
		String s4 = new String("abc"); // new Ű���尡 ���Ǹ� ����� ��ü����
		
		
		if(s4 == s3){
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ�");
		}
			
		Scanner s = new Scanner(System.in);
	
		String s5 = s.next();
		if(s5.equals("y")){
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ�");
		}
		String msg = "ȫ�浿";
		
		
		
	}
}
