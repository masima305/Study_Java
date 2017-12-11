package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6_FileInput {
	public static void main(String[] args) {
		String path = "c:/java_study/"+"test.txt";
		File f = new File(path);
		byte[] b_read = new byte[7];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(b_read);
				
				String result = new String (b_read);
				System.out.println(result.length());
				System.out.println(result);
				
				if(fis != null){
					fis.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
	}
}
