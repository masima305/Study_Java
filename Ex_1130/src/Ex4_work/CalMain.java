package Ex4_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Cal cal = new Cal();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("A를 입력해주세요");
		int a = scanner.nextInt();
		System.out.println("B를 입력해주세요");
		int b = scanner.nextInt();
		System.out.println("연산자 입력해 주세요");
		String c = scanner.next();
		
		System.out.println("결과 : " + cal.getResult(a, b, c));
	
	}	

}
