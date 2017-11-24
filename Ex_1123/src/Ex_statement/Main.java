package Ex_statement;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int count ;
		int list = 7;
		int temp = 0;
		int min = 101;
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < list; j++) {
			
				temp = scanner.nextInt();
				if (temp %2 == 0) {
					if ( temp < min) {
						 min = temp ;
					}
					total += temp;
				}
			}
			System.out.println(total+" "+min);
			total = 0;
			min = 101;
		}
	}
}
