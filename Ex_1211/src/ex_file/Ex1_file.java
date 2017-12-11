package ex_file;

import java.io.File;

public class Ex1_file {
	public static void main(String[] args) {
		//IO (Input, Output)]
		//입출력 스트림을 의미함.
		//데이터를 입출력 하기위한 방법임.
		//JVM이 콘솔에서 값을 받으면 Input, 값을 내보내면 OutPut
		
		// 파일 객체 생성을 위한 경로
		
		String path = "c:/java_study/test.txt";
		File f = new File(path);
		
		if(f.isFile()) {//파일 클래스가 참조하는 경로가 파일일 경우
			System.out.println("파일의 크기 :"+f.length());//파일 크기를 알 수 있음.
		}
		
		
		
		
	}
}
