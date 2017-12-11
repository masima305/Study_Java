package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex7_FileInput {
	public static void main(String[] args) throws IOException {
		String str = "";
		String path =  "c:/java_study/"+"file.txt";
		File f = new  File(path);
		FileInputStream fis = null; 
		int code = -1;
		try {
			fis = new FileInputStream(f);
			while((code = fis.read()) != -1) {
				 str += (char)code;
			}
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != str.charAt(str.length()-(i+1))) {
					//flag = false;
				}else{
					//flag = true;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			fis.close();
		}
		
		
		/*boolean flag = true;
		
		byte [] a= new byte[8];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(a);
				String b = new String(a).trim();
				for (int i = 0; i < b.length(); i++) {
					if (b.charAt(i) != b.charAt(b.length()-(i+1))) {
						flag = false;
					}else{
						flag = true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}*/
	}
}
