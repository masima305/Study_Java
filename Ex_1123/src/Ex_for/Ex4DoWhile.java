package Ex_for;

import java.util.Random;

public class Ex4DoWhile {
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		int count = 0;
		
		do {
			 a = new Random().nextInt(130);
			 b = new Random().nextInt(130);
			 c = new Random().nextInt(130);
		}
		while( a > 100 || b > 100 || c > 100 );
		System.out.printf("%d , %d , %d", a, b, c);
	}
}
