package Ex_baseball;

import java.util.Scanner;

public class Ex4Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int n = scanner.nextInt();
		
		char alph [] = new char [n];
		for (int i = 0; i < alph.length; i++) {
			alph [i] = (char) (65+i);
		}
		for (char j : alph) {
			System.out.println(j);
		}
		scanner.close();
	}
}
