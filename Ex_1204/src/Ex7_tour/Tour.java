package Ex7_tour;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Guide guide = new Guide(n);
		System.out.println("������ ���");
		for (int i = 0; i < guide.guest.length; i++) {
			System.out.println("�̸� : " );
			guide.guest[i].setName(sc.next());
			System.out.println("���� : " );
			guide.guest[i].setGender(sc.next());
			System.out.println("���� : " );
			guide.guest[i].setAge(sc.nextInt());
			System.out.println("------------------------------------------" );
		}
		while(true) {
			System.out.println("1. ������ ����");
			System.out.println("2. ������ ����");
			System.out.println("etc. ����");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				for (int j = 0; j < guide.guest.length; j++) {
					System.out.println("�̸�  : "+guide.guest[j].getName());
					System.out.println("���� : "+guide.guest[j].getAge());
					System.out.println("����  : "+guide.guest[j].getGender());
					System.out.println("������  : "+guide.guest[j].getPoint());
					System.out.println("----------------------------------");
				}
				break;
			case 2:
				System.out.print("���� �����? : ");
				Guide.point = sc.next();
				break;
			default:
				break;
			}





		}
	}
}
