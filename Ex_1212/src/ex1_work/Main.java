package ex1_work;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user;
		Scanner s = new Scanner(System.in);
		Saver saver;
		char selector = 0;
	
		System.out.println("���̵� �Է��ϼ��� : ");
		String id = s.next();
		user = new User(id);
		Loader loader = new Loader(user);
		//�ε� or ����
		user = new User(id);
		
		
		
		while (selector != 'n') {
			System.out.println("���� (s) | ����(r) | ��(p)");
			System.out.print(">>");
			String player = s.next();
			player.charAt(0);
			int temp;
			if(player.charAt(0) == 's') {
				temp = 1;
			}else if(player.charAt(0) == 'r') {
				temp = 2;
			}else if(player.charAt(0) == 'p') {
				temp = 3;
			}else {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
				}
			
			int c = new Game().checkGame(temp);
			
			switch (c) {
			case 0:
				System.out.println("���º�");
				user.drawGame();
				break;
			case 1:
				System.out.println("�̰���");
				user.winGame();
				break;
			case 2:
				System.out.println("����");
				user.lossGame();
				break;
			}
			
			user.showCount();
			System.out.print("�ٽ��Ͻðڽ��ϱ�? y | n : ");
			selector = s.next().charAt(0);
		}
		
		try {
			saver = new Saver(user);
			//��ü�� �뤊�� �����ؾ��ϴ� ��Ȳ�� ������ ����ȭ ó���� ����� �Ѵ�.
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//��ü ����ȭ ó���� ����� �Ѵ�,
		}
		
		System.out.println("������ �����մϴ�.");
		

	}
}
