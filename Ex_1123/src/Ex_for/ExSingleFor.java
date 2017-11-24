package Ex_for;

import java.util.Scanner;

public class ExSingleFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//for문, 단일 for문/
		// 특정 명령을 원하는만큼 반복적으로 사용하고자 하게 해줌. 
		for (int i = 0; i < args.length; ) {
			i++; // 이렇게 인덱스를 바깥으로 뺄 수 있음. 만약 if문과  같이 쓸 경우 조건절이 포함된 while문으로 사용이 가능하다.
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(10-i);
		}
		for(int i = 15; i > 0; i--) {
			if (i%3 == 0) {
				System.out.println(i+"는 3의 배수입니다.");
			}
		}
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("단을 입력하세요");
		int dan = scanner.nextInt();
		if (dan > 9 || dan < 2) {
			System.out.println("2~9사이의 값만 입력할 수 있습니다.");
		}else {
			for(int i = 1; i < 10 ; i++) {
				System.out.printf("\n %d * %d = %d",dan,i,dan*i);
			}
		}
	}
}
