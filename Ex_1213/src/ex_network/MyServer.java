package ex_network;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	ServerSocket ss;
	
	public MyServer() {
		try {
			//���� ������ �����Ҷ� ���񽺸� ���� ��Ʈ��ȣ�� ����
			//�̴� Ŭ���̾�Ʈ�� ������ �� �ʿ�
			//���� ��Ʈ��ȣ�� ������ �� 2000�� ������ ��ȣ�� ���
			
			System.out.println("���� �غ�");
			ss = new ServerSocket(3000);	
			
			
		}catch (Exception e) {
			
		}//try
	}//const
	
	
	
	@Override
	public void run() {
		
		while (true) {
			try {
				//Ŭ���̾�Ʈ
				Socket s = ss.accept();//������ �����ڸ� �޾Ƶ��̴� �κ�
				//���� �����ڰ� �������� �Ѹ��̶� �����ڰ� ���ö����� ����Ű�� �޼�����.
				
				//Ŭ���̾�Ʈ�� ip �ּҸ� �����´�.
				String ip = s.getInetAddress().getHostAddress();
				//
				
				System.out.println(ip+"�� �Դٰ�");
				
			}catch(Exception e) {
				
			}
			
		}
	}// run
	
	
	
}//class
