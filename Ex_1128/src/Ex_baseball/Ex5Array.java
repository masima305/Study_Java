package Ex_baseball;

import java.util.Random;

public class Ex5Array {
	public static void main(String[] args) {
		//난수만큼의 돈을 최대한 적은 수의 동전으로 나누어주기.

		int [] coin = {500,100,50,10};
		int [] count = {0,0,0,0};

		int money = ((new Random().nextInt(5000-10)+10)/10)*10;
		System.out.println(money);
	
		while (money > 0) {
			for (int i = 0; i < coin.length; i++) {
				while(true) {
					if(money > coin[i]) {
						
						money -= coin[i];
						count[i]++;
						System.out.println(money);
						
						if(money < coin[i]) {
							break;
						}
						
					}
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%d원짜리 : %d개 \n", coin[i], count[i]);
			
		}
	}
}
