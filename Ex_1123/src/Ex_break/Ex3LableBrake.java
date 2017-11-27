package Ex_break;

public class Ex3LableBrake {
	public static void main(String[] args) {
	ma:	for(int i = 1; i <= 3 ; i++) {
			for(int j = 1; j < 5 ; j++) {
				
				if  ( j % 2 == 0) {
					break ma;
				}
			}
		}
	}
}
