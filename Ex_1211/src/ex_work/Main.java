package ex_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Timer timer = new Timer();
		WordMaker r = timer.outList();
		Thread th = new Thread(timer);
		th.start();
		
		
		outer : while(true) {
			String awn = s.next();
			r.deleteProblems(awn);
			r.showProblems();
			if(r.isEnd() == true) {
				System.out.println("Å¬¸®¾î!");
				break outer;
			}
		}
		
		
	}
}
