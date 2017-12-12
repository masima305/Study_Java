package ex_char_input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5_BufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:/java_study/bufWriter.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("ù ����");
			bw.write("\r\n");
			bw.write("�� ���� fin");
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			bw.close();
			fw.close();
		}
		
	}
}
