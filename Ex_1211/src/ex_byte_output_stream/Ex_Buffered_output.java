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
			
			String msg = "buf��Ʈ�� �����Դϴ�!!!.\r\n";
			bos.write(msg.getBytes());
			
			//Write�޼���� ���������� ������ �����ϱ� ���� �� ������ ����ϴ� �޼����̹Ƿ�, flush�� ȣ������� �Ѵ�.
			bos.flush();//������ �ݱ� ������ �Ű澲�δٸ� �÷����� ���ִ°� ����.
			
		
		} catch (Exception e) {
			
		}finally {
			// �������� �ݴ� ������ �߿���,
			//���� ���� �ݰ� ������ �ݾƾ���.
			if(bos != null) bos.close();
			if(fos != null) fos.close();
		}
	}
}
