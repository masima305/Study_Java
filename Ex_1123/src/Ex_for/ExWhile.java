package Ex_for;

public class ExWhile {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		
		while(num1 <= 5){
			System.out.printf("%d = ", num1++);
			for (int i = 0; i <= 5; i++) {
				System.out.printf("%d", num2++);
			}
		}
	}
}
