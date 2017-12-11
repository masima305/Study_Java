package ex_byte_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_FileOutput {
	public static void main(String[] args) throws IOException {
		String path = "c:/java_study/output.txt";
		File f = new File(path);
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
			String msg = "기록할 내용";
			fos.write(msg.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fos != null) fos.close();
		}
	}
}
