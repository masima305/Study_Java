package Ex_work;

public class Ex3Work {
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 10; i++) { 
			for (int j = 1; j <= 10; j++) {
				int result = (j+count)%10;
				if (result == 0) result = 10;
				System.out.print(" "+result);
			}
			count++;
			System.out.println();
		}
	}
}
