package ex_byte_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_Work {
	public static void main(String[] args) throws IOException {
		String path = "c:/java_study/OutExam";
		File f = new File(path);
		FileOutputStream fos = null;
		
		try {
			f.mkdirs();
			fos = new FileOutputStream(path+"/out.txt");
			//���� �ƿ�ǲ ��Ʈ���� ��Ʈ������ �����н��� �ٷ� ���� �� �ִ�.
			
			String msg = "����";
			fos.write(msg.getBytes());
		} catch (Exception e) {
			
		}finally {
			if( fos != null) {fos.close();}
		}
		
	}//main
}
