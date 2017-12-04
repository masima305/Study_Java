package Ex5_work;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 0에서 9사이의 난수를 100개 만들음.
		// 발생된 난수의 각 자릿수가 각각 몇개씩있는지 그래프화 시키세요
		
		Random random = new Random();
		SaveData saver = new SaveData();
		ShowData shower = new ShowData();
		
		for (int i = 0; i < 10; i++) {
			int n = random.nextInt(10);
			System.out.print(n);
			saver.save(n);
		}
		shower.show(saver.giveCount());
	}

}
