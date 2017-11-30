package Ex_multi_array;

import java.util.Scanner;

public class Ex5MultiArray {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("등록 할 인원 : ");
		int n = scanner.nextInt();
		String info [][] = new String [n][3];
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(+i+1+"번 항목");
			System.out.print("이름 : ");
			info[i][0] = scanner.next();
			System.out.print("수학 : ");
			info[i][1] = scanner.next();
			System.out.print("영어 : ");
			info[i][2] = scanner.next();
		}
	
		for (int i = 0; i < n; i++) {
			System.out.println(+i+1+"번 항목");
			System.out.print("  이름 : "+info[i][0]);
			System.out.print("  수학 : "+info[i][1]);
			System.out.println("  영어 : "+info[i][2]);
		}
		
	
	}
}
