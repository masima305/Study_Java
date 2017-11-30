package Ex_baseball;
import java.util.Arrays;
import java.util.Random;
public class Ex6Array {
	public static void main(String[] args) {
		int [] lotto = new int[6];
	
		
		
		
		for (int i = 0; i < lotto.length; i++) {
			int temp = new Random().nextInt(6)+1;
			
			
			for (int j = 0; j < i; j++) {
				if (temp == lotto[j]) {
					temp = new Random().nextInt(6)+1;
					j = -1;
				}
			}	
			
			lotto[i]=temp;
			System.out.println(lotto[i]);
		}
		
		
		
		/*outer : for (int i = 0; i < lotto.length; ) {
			lotto[i] = new Random().nextInt(6)+1;
			
			//중복값 비교
			for (int j = 0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.printf("%d", lotto[i]);
			i++;
		}*/
		
		
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}