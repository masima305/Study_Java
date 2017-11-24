package Ex_scanner;

import java.util.Scanner;

public class Ex2Scanner {
	public static void main(String[] args) {
		//키보드에서 정수 2개와 연산기호를 입력받음. 
		//입력 받은 세게의 정보를 가지고 아래와 같은 결과를 도출
		int a = 0;
		int b = 0;
		int r = 0;
		String c = null ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 :");
		a = scanner.nextInt();
		System.out.print("두번째 :");
		b = scanner.nextInt();
		System.out.print("연산자 :");
		c = scanner.next();
		
		
		switch (c) {
		case "+":
			r = a + b;
			System.out.printf("%d + %d = %d", a,b,r);
			break;
		case "-":
			r = a - b;
			System.out.printf("%d - %d = %d", a,b,r);
			break;

		case "*":
			r = a * b;
			System.out.printf("%d * %d = %d", a,b,r);
			break;
		case "/":
			
			r = a / b;
			System.out.printf("%d / %d = %d", a,b,r);
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
		
		scanner.close();
		
	}
}
