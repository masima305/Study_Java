package ex1_work;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user;
		Scanner s = new Scanner(System.in);
		Saver saver;
		char selector = 0;
	
		System.out.println("아이디를 입력하세요 : ");
		String id = s.next();
		user = new User(id);
		Loader loader = new Loader(user);
		//로드 or 생성
		user = new User(id);
		
		
		
		while (selector != 'n') {
			System.out.println("가위 (s) | 바위(r) | 보(p)");
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
				System.out.println("다시입력하세요");
				continue;
				}
			
			int c = new Game().checkGame(temp);
			
			switch (c) {
			case 0:
				System.out.println("무승부");
				user.drawGame();
				break;
			case 1:
				System.out.println("이겼음");
				user.winGame();
				break;
			case 2:
				System.out.println("졌음");
				user.lossGame();
				break;
			}
			
			user.showCount();
			System.out.print("다시하시겠습니까? y | n : ");
			selector = s.next().charAt(0);
		}
		
		try {
			saver = new Saver(user);
			//객체를 통쨰로 저장해야하는 상황이 생기면꼭 직렬화 처리를 해줘야 한다.
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//개체 직렬화 처리를 해줘야 한다,
		}
		
		System.out.println("게임을 종료합니다.");
		

	}
}
