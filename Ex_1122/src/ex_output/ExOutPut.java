package ex_output;

import java.awt.print.Printable;

public class ExOutPut {
	public static void main(String[] args) {
		int age = 21;
		System.out.println("저의 나이는 "+age+"세입니다.");
		
		System.out.printf("저의 나이는 %d 세입니다, 동생은 %d 입니다.", age, 19);
		
		System.out.printf("\n 사과: %d 귤: %d 포도: %d",5,10,15);
		System.out.printf("원주율은 %f",3.141592);
		System.out.printf("프린트 : %c",'A');
		
	
	}
}
