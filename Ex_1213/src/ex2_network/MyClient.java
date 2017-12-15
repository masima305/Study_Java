package ex2_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		if(msg.trim().length() > 0) {
			Socket s = null;
			
		
		
		try {
			s = new Socket("192.168.0.73",3001);
			PrintWriter out = new PrintWriter(s.getOutputStream());
			
			// ������ ���ڿ� ����
			out.write(msg);
			
			out.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		
		}finally {
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
	}
}
