package ex_anonymous;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3TryCatch {
	public static void main(String[] args) {
		//Scanner 를 통해정수를 받았을 경우
		//입력받은 수를 그대로 화면에 출력.
		//정수 이외의 값을 입력 받았다면
		//정수만 입력할 수 있습니다라는 메시지 출력하기.
		int n = -1;
		String input = new Scanner(System.in).next();
		try {
			int a = Integer.parseInt(input);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(input+"는 정수가 아닙니다.");
			return;
		}
	}
}
