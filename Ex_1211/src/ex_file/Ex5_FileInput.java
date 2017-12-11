package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex5_FileInput {
	public static void main(String[] args) {
		String path = "c:/java_study/"+"test.txt";
		File f = new File(path);
		if ( f.exists() ) {
			//���� Ŭ���� f�� ����� �Է� ��Ʈ��
			
			try {
				FileInputStream fis = new FileInputStream(f);
			
				int code = 0;
				//��Ʈ���� ���̻� �������� ���ٸ�  -1�� ��ȯ�ϰ� �Ǿ��ִ�.
				//������ ��� ������ �б� ���� while���� ����ߴµ�
				//while�� ������ ���� EOF(End Of file) -1�� ���������� �ݺ��ȴ�.
				
				while ((code = fis.read()) != -1) {
					System.out.print( (char)code);
				}
				if(fis != null) {
					fis.close();
				}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
