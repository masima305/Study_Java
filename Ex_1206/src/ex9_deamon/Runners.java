package ex9_deamon;

import java.util.Random;

public class Runners {
	public static void main(String[] args) {
		
		int [] playerRandom = new int [4];
		String [] playerJump = new String[playerRandom.length];
		for (int i = 0; i < playerJump.length; i++) {
			playerJump[i] = "";
		}
		boolean finish = false;
		int finishPlayer = 0;
		
		while(true) {
			//�޸� �Ÿ��� �������� ����.
			
			for (int i = 0; i < playerJump.length; i++) {
				playerRandom[i] = new Random().nextInt(3);
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//������ �߻���Ų ������ ������ �� ������ ����Ÿ��� ����
			
			for (int i = 0; i < playerJump.length; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i]+="";
					break;
				case 1:
					playerJump[i]+=" ";
					break;
				case 2:
					playerJump[i]+="  ";
					break;
				}//switch
			}//for
			System.out.println("---------------------------------------------------");
			
			for (int i = 0; i < playerJump.length; i++) {
				System.out.print(playerJump[i]);
				System.out.println(i+1+"��");
				if(playerJump[i].length() >= 70){
					finishPlayer = i+1;
					finish = true;
				}
			}
			
			System.out.println("---------------------------------------------------");
			//���
			if (finish) {
				System.out.println("win - "+finishPlayer);
				break;
			}
			
		} // true
	}//main
}
