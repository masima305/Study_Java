package ex_byte_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_Buffered_output {
	public static void main(String[] args) throws IOException {
	
		String path = "c:/java_study/bufout.txt";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			
			String msg = "buf스트림 예제입니다!!!.\r\n";
			bos.write(msg.getBytes());
			
			//Write메서드는 물리적으로 내용을 저장하기 전에 그 내용을 기억하는 메서드이므로, flush를 호출해줘야 한다.
			bos.flush();//버퍼의 닫기 순서가 신경쓰인다면 플러쉬를 써주는게 좋다.
			
		
		} catch (Exception e) {
			
		}finally {
			// 쓸때에는 닫는 순서가 중요함,
			//버퍼 먼저 닫고 파일을 닫아야함.
			if(bos != null) bos.close();
			if(fos != null) fos.close();
		}
	}
}
