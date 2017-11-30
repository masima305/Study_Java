package Ex_string;

import java.util.Scanner;

public class Ex1String {
	public static void main(String[] args) {
		//클래스중에서 대표적이라고 할 수 있는 string 클래스
		// String 클래스는 두가지 특징이 있다.
		// 1)객체 생성법이 두가지(암시적, 명시적)
		// 2)한 번 생성된 문자열의 내용은 변하지 않는다.
		
		String s1 = "abc";
		String s2 = "abc";
		// 기본 자료형들은 값을 비교하지만,
		// 클래스를 사용하는 것들은 주소값들을 비교한다.
		//-> 암시적 객체생성.
	
		if(s1 == s2){
			System.out.println("주소가 같음");
		}else {
			System.out.println("주소가 다름");
		}
		
		System.out.println("------------------------------------------------");
		
		String s3 = new String("abc"); // new 키워드가 사용되면 명시적 객체생성
		String s4 = new String("abc"); // new 키워드가 사용되면 명시적 객체생성
		
		
		if(s4 == s3){
			System.out.println("주소가 같음");
		}else {
			System.out.println("주소가 다름");
		}
			
		Scanner s = new Scanner(System.in);
	
		String s5 = s.next();
		if(s5.equals("y")){
			System.out.println("주소가 같음");
		}else {
			System.out.println("주소가 다름");
		}
		String msg = "홍길동";
		
		
		
	}
}
