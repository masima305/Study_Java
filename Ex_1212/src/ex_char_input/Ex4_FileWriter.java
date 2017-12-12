package ex_char_input;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4_FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("c:/java_study/fileWriterEx.txt");
			
			String str = "¿¹Á¦";
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			fw.close();
		}
		
	}
}
