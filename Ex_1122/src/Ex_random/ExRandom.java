package Ex_random;

import java.util.Random;

public class ExRandom {
	public static void main(String[] args) {
		//int num = new Random().nextInt(5:����)+1:���ۼ�; 
		int num = new Random().nextInt(10-2)+2;
		System.out.println(num);
		
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("\n %d * %d = %d",num,i,num*i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//�߻��� ����; 
		
		int ch = new Random().nextInt('Z'-'A'+1)+'A';
		System.out.println((char) ch);
	}
}
