package Ex_work;

import java.util.Scanner;

public class Ex5Work {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < 20; j++) {
			System.out.print(j+" : ");
			for (int i = 2; i <= j; i++) {
				int m = j%i;
				
				
				if(m == 0 && i != j) {
					System.out.println("소수가 아님");
					break;
				}
				else if (m == 0 && i == j) {
					System.out.println("소수임");
				}
			
			}
		}
		
	}
}
