package ex_byte_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex_FileInput {
	public static void main(String[] args) throws IOException {
		//C:\java_study\work\Ex_1208\src\ex1_work\User.java
		/*Scanner sc = new Scanner(System.in);
		System.out.println("읽어올 경로를 입력하세요 : ");
		String path = sc.next();*/
		
		
		
		//스캐너의 원형 구현....
		byte [] consol = new byte [100];
		System.out.print("읽어올 경로 : ");
		System.in.read( consol );
		String path = new String(consol).trim();
		
		
		
		
		File f = new File(path);
		FileInputStream fis = null;
		
		byte [] b_read = new byte[(int)f.length()];
		try {
			
			fis = new FileInputStream(f);
			fis.read(b_read);
			String result = new String(b_read);
			System.out.println(result);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fis != null) {
				fis.close();
			}
		}
		
		
		
		
	}
}
