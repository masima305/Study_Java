package ex1_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Manager manager = new Manager();
		outer : while(true) {
			int selector = 0;
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��ü����");
			System.out.println("4. ����.");
			selector = s.nextInt();
			switch (selector) {
			case 1:
				manager.insert();
				break;.
			case 2:
				manager.delete();
				break;	
			case 3:
				manager.showInfo();
				break;
			case 4:
				
				break outer;

			default:
				break;
			}
		}
	}
}
