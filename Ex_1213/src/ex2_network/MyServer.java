package ex2_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	ServerSocket ss;
	
	public MyServer() {
		// TODO Auto-generated constructor stub
	
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� ����");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void run() {
		try {
			Socket s = ss.accept();
			//������ �����ڰ� ���ö����� ���� ���.
			
			String ip = s.getInetAddress().getHostAddress();
			
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(isr);
			
			String msg = reader.readLine();
			System.out.println(ip+":"+msg);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		super.run();
	}
	
}
