package ex3_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2Map {
	public static void main(String[] args) {
	//id�� �Է��ϼ��� .. : ������.
	// password�� �Է��ϼ��� : ������.
	// ���
	// ���̵� �������� �ʽ��ϴ�.
	// ��й�ȣ�� �������� �ʽ��ϴ�.
	//	�α��� ����
		
		HashMap<String, Integer> map = new HashMap();
		Scanner s = new Scanner(System.in);
		map.put("Kim", 1111);
		map.put("Lee", 2222);
		map.put("Park", 3333);
		while (true) {
			System.out.println("���̵� �Է��ϼ���");
			String id = s.next();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			int pass = s.nextInt();
			if (map.containsKey(id)){
				if (map.get(id) == pass) {
					System.out.println("�α��� ����");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				
			}else {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
			}
			System.out.println("=======================================d");
		}
	
	}//main
}
