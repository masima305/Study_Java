package ex_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "c:/java_study";
		
		File f = new File(path);
		if (f.isDirectory()) {
			File [] file = f.listFiles();

			for (int i = 0; i < file.length; i++) {
				if (file[i].isFile()) {
					System.out.println(file[i].getName());
				}else {
					System.out.println(file[i].getName());
				}
			}
		}
	}
}

