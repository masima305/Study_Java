package Ex7_tour;

import java.util.Scanner;

public class Tour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Guide guide = new Guide(n);
		System.out.println("관광객 등록");
		for (int i = 0; i < guide.guest.length; i++) {
			System.out.println("이름 : " );
			guide.guest[i].setName(sc.next());
			System.out.println("성별 : " );
			guide.guest[i].setGender(sc.next());
			System.out.println("나이 : " );
			guide.guest[i].setAge(sc.nextInt());
			System.out.println("------------------------------------------" );
		}
		while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적기 변경");
			System.out.println("etc. 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				for (int j = 0; j < guide.guest.length; j++) {
					System.out.println("이름  : "+guide.guest[j].getName());
					System.out.println("나이 : "+guide.guest[j].getAge());
					System.out.println("성별  : "+guide.guest[j].getGender());
					System.out.println("목적지  : "+guide.guest[j].getPoint());
					System.out.println("----------------------------------");
				}
				break;
			case 2:
				System.out.print("어디로 갈까요? : ");
				Guide.point = sc.next();
				break;
			default:
				break;
			}





		}
	}
}
