package ex_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_Throws {
	public void setFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("c:/java_study/t.txt");
	}
}
