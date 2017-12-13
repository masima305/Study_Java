package ex_network;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {
	ServerSocket ss;
	
	public MyServer() {
		try {
			//서버 소켓을 생성할때 서비스를 위한 포트번호를 지정
			//이는 클라이언트가 접속할 때 필요
			//서비스 포트번호의 범위는 약 2000번 이후의 번호를 사용
			
			System.out.println("서버 준비");
			ss = new ServerSocket(3000);	
			
			
		}catch (Exception e) {
			
		}//try
	}//const
	
	
	
	@Override
	public void run() {
		
		while (true) {
			try {
				//클라이언트
				Socket s = ss.accept();//서버가 접속자를 받아들이는 부분
				//실제 접속자가 없을때는 한명이라도 접속자가 들어올때까지 대기시키는 메서드임.
				
				//클라이언트의 ip 주소를 가져온다.
				String ip = s.getInetAddress().getHostAddress();
				//
				
				System.out.println(ip+"님 왔다감");
				
			}catch(Exception e) {
				
			}
			
		}
	}// run
	
	
	
}//class
