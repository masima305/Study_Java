package ex_char_input;

import java.io.FileReader;
import java.io.IOException;

public class Ex_FileReader {
	public static void main(String[] args) throws IOException {
		//�ѱ��� ������ ���� ���ؼ� 1����Ʈ�� �ɰ��� �ʾƵ� ������.
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("c:/java_study/test.txt");
			int code = -1;
			
			while((code = fr.read()) != -1){
				System.out.print( (char)code );
				
			}//while
		
		}catch (Exception e){
			// TODO: handle exception
		}finally {
			if(fr != null) {
				fr.close();
			}
		}
		
		
	}
}
