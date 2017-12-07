package ex5_homeWork;

import java.util.Random;

public class ProblemMaker {
	private int a = 0;
	private int b = 0;
	private int r = 0;
	
	private int count = 0;
	private boolean flag = false;
	
	public void makeProblem() {
		a = new Random().nextInt(101)+1;
		b = new Random().nextInt(101)+1;
		r = a+b;
		System.out.println(a +" + "+b+" = ");
	}
	
	public void checkProblem( int r) {
		if(this.r == r) {
			count++;
			System.out.println("정답");
			if(count == 5) {
				flag = true;
			}
		}else {
			System.out.println("오답");
		}
	}
	public boolean getFlag() {
		return flag;
	}
	
	
}
