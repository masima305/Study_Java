package ex_anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2Anon {
	public static void main(String[] args) {
		Frame f = new Frame();
		Button btn = new Button("종료");
		
		f.setSize(300, 300);
		f.add(btn);
		f.setVisible(true);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("클릭함");
			}
		});
	}
	
	
}
