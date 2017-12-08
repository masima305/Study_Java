package ex1_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Manager manager = new Manager();
		outer : while(true) {
			int selector = 0;
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료.");
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
