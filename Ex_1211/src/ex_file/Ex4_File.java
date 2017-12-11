package ex_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = "c:/java_study/"+"test/abc";
		File f = new File(path);

		if (!f.exists()) {// 경로가 실제로 존재하지 않으면~!
			System.out.println("폴더를 생성했습니다.");
			//f.mkdir();// 한번에 한개만 만들어줌,(별로 쓸 일이 없다.)
			f.mkdirs();// 한번에 두개 이상의 폴더를 만들어줌.
			
		}else {
			System.out.println("폴더가 존재합니다.");
		}
	}
}
