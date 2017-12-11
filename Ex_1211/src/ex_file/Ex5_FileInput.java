package ex_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex5_FileInput {
	public static void main(String[] args) {
		String path = "c:/java_study/"+"test.txt";
		File f = new File(path);
		if ( f.exists() ) {
			//파일 클래스 f와 연결된 입력 스트림
			
			try {
				FileInputStream fis = new FileInputStream(f);
			
				int code = 0;
				//스트림은 더이상 읽을것이 없다면  -1을 반환하게 되어있다.
				//파일의 모든 내용을 읽기 위해 while문을 사용했는데
				//while은 파일의 끝인 EOF(End Of file) -1을 만날때까지 반복된다.
				
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
