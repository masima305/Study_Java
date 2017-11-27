package ex_multi_for;

public class Ex3_multi_for {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("------------------------------------");
	for (int i = 0; i < args.length; i++) {
		for (int j = 0; j < args.length; j++) {
			System.out.println("*");
		}
	}
	
	}
}
