package Ex_work;

import java.util.Scanner;

public class Ex4Work {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	
		int a = 1;
		int b = 1;
		
		System.out.println(1);
		System.out.println(1);
		
		for (int i = 2; i < n; i++) {
			int result = a + b;
			System.out.println(result);
			a = b;
			b = result;
		}
	}
}
