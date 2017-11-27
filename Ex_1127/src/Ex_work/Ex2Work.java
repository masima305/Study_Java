package Ex_work;

import java.util.Scanner;

public class Ex2Work {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int total = 0;
		
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for (int i = n1; i <= n2; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
