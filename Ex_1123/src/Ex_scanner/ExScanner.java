package Ex_scanner;

import java.util.Scanner;

public class ExScanner {
	// 키보드에서 값을 받기 위한 Scanner 클래스
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.println("문장을 입력");
		String str = scanner.next();
		System.out.println(str);
		
		String strln = scanner.nextLine();
		System.out.println(strln);
		
		scanner.close();
		
		
		
	}
}
