package ex_file;

import java.io.File;

public class Ex2_file {
	public static void main(String[] args) {
		String path = "c:/java_study";
		File f = new File(path);
		String list [];
		//폴더의 하위목록들 이름을 다 가지고 올꺼다.
		
		if(f.isDirectory()) {//경로이기만 하다면
			//디렉토리 안에있는 하위 요소들의 이름을 모두 가져온다.
			String [] names = f.list();
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
		}
	}
}
