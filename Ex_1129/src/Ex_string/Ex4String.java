package Ex_string;

import java.util.Scanner;

public class Ex4String {
	public static void main(String[] args) {
		//ȸ���� �Ǵ��ϱ�
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		int middle = text.length()/2;;
		
		if (text.length()%2 !=0 ) {
			middle++;
		}
	
		char [] a = text.toCharArray();
		
		for (int i = 0; i < middle; i++) {
			char aa = a[i+middle];
			char bb = a[middle-i-1];
			if (aa != bb) {
				System.out.println("ȸ������ �ƴմϴ�");
				break;
			}		
		}
		System.out.println("ȸ�����Դϴ�");
	}
}
