package Ex_string;

import java.util.Scanner;

public class Ex5String {
	public static void main(String[] args) {
		// 이메일을 입력받고 골뱅이 앞의 문자 길이가 6보다 작거나 10보다 클 경우 오류메시지 출력.
		Scanner scanner = new Scanner(System.in);
		
		String email = scanner.next();
		String [] a = email.split("@");
		
		if (a[0].length() < 6 || a[0].length() > 10) {
			System.out.println("이메일 형식이 올바르지 않습니다.");
		}else{
			System.out.println("로그인 성공");
		
		}
	}
}
