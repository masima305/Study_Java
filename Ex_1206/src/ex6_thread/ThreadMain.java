package ex6_thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		//Ű���忡�� ������ �Է¹޴´�.
		//�Է¹��� ������ sub���� �ѱ��
		//1�ʿ� 1�� �����ϴٰ� ���� ���.
		Scanner s = new Scanner(System.in);
		
		
		ThreadSub ts = new ThreadSub();
		ts.setN(s.nextInt());
		
		ts.start();
	}
}
