package ex5_homeWork;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Thread t = new Thread(timer);
		ProblemMaker maker = new ProblemMaker();
		Scanner scanner = new Scanner(System.in);
		t.start();
		while (maker.getFlag() == false) {
			maker.makeProblem();
			maker.checkProblem(scanner.nextInt());
		}
		System.out.println("³¡");
		t.interrupt();
		
	}
}
