package Ex_work;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
	}
}