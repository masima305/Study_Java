package ex_multi_for;

public class Ex1MultiFor {
	public static void main(String[] args) {
		int count = 1;
		for (int  i = 1; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}

		System.out.println("----------------------------------");	
		
		char a = 'A';
		for (int  i = 1; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print((char)a++);
			}
			System.out.println();
		}
	}
}
