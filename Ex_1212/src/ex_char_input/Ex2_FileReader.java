package ex_char_input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) throws IOException {
		// readChar.txt�� �о �ؽ�Ʈ ������ ���ĺ� �빮�ڿ� �ҹ��ڰ� ���� ��� �ִ�ġ �Ǵ��ϴ� �ڵ� �ۼ�,
		FileReader fr = null;
		int big = 0;
		int small = 0;
		
		try {
			int code = -1;
			 fr = new FileReader("c:/java_study/readChar.txt");
			while((code = fr.read()) != -1) {
				if (code < (int)'a') {
					big++;
				}else {
					small++;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("big : "+big);
			System.out.println("small : "+small);
			fr.close();
		}
		
		
		
		
	}
}
