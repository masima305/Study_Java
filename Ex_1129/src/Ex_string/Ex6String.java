package Ex_string;

import java.util.Scanner;

public class Ex6String {
	public static void main(String[] args) {
		String [][] actor = {{"[�۰�ȣ]","����","����","����"},	
							 {"[������]","���ϵ�","����","BHC"},						
							 {"[�����]","���ϵ�","����","����"}};
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("��츦 �˻��ϼ���");
		String name = scanner.next();
		int flag = 0;
		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].substring(1, actor[i][0].length()-1).equals(name)){
				System.out.println(actor[i][0]+"���� �ʸ�׶���");
				flag = 1;
				for (int j = 1; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			}
		}
		if (flag == 0) {
			System.out.println("�˻������ �����ϴ�.");
		}
	}
}
