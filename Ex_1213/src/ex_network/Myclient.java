package ex_network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Myclient {
	public static void main(String[] args) {
		try {
			
			//Ŭ���̾�Ʈ�� ������ ������ip�ּҿ� ��Ʈ��ȣ�� ����
			Socket s = new Socket("192.168.0.73",3000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
