package ex1_work;

import java.util.Random;

public class Game {
		int com = new Random().nextInt(4)+1;
		
		public int checkGame(int a) {
			//0:¹«½ÂºÎ, 1:½Â, 2:ÆÐ
			int result = 0;
			if(a == com) {
				result = 0;
			}else if(a == 1 && com == 3){
				result = 1;
			}else if(a-1 == com) {
				result = 1;
			}else {
				result = 2;
			}
			return result;
		}
}
