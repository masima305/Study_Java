package ex_char_input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3_Buffered_Reader {
	public static void main(String[] args) throws IOException {
			FileReader fr = null;
			BufferedReader br = null;
			
			
			
			try {
				
				fr = new FileReader("c:/java_study/test.txt");
				br = new BufferedReader(fr);
				String str = "";
				while((str = br.readLine()) != null) {
					System.out.println(str);
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(fr!=null) {
					fr.close();
				}
				if(br!=null) {
					br.close();
				}
			}
			
	}

}
