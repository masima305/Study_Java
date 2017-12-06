package ex6_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		//키보드에서 정수를 입력받는다.
		//입력받은 정수를 sub으로 넘기고
		//1초에 1씩 감소하다가 종료 출력.
		Scanner s = new Scanner(System.in);
		
		
		ThreadSub ts = new ThreadSub();
		ts.setN(s.nextInt());
		
		ts.start();
	}
}
