package Ex_baseball;

import java.util.Random;
import java.util.Scanner;

public class Ex_baseball {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int com [] = new int [3];
		
		int user [] = new int [3];

		int count = 0;

		do {
			// 1���� 9 ������ ������ ������..
			
			for (int i = 0; i < com.length; i++) {
				com[i] = new Random().nextInt(9)+1;
			}
			
		}while(com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
		String str []= {"ù��°", "�ι�°", "����°"}; 
		
		while (true) {
			count++;
			
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
			int strike = 0;
			int ball = 1;



			if (user[1] == com[1]) {
				strike++;
			}else if(user[1] == com[2] || user[1] == com[3] ) {
				ball++;
			}

			if (user[2] == com[2]) {
				strike++;
			}else if(user[2] == com[1] || user[2] == com[3] ) {
				ball++;
			}

			if (user[3] == com[3]) {
				strike++;
			}else if(user[3] == com[1] || user[3] == com[2] ) {
				ball++;
			}


			//����ó��
			if (strike ==3) {
				System.out.println(""+count+"ȸ ���� �����Դϴ�.");
			}else {
				if(strike == 0 || ball == 0) {
					System.out.println("out!");
				} else {
					System.out.println("Strike : "+strike);
					System.out.println("Ball : "+ball);
				}
			}
		}
	}
}
