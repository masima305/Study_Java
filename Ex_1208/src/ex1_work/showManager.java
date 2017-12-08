package ex1_work;

import java.util.ArrayList;

public class showManager {
	
	
	public void showInfo(ArrayList<User> list) {
		System.out.println("====전체정보====");
		for (int i = 0; i < list.size(); i++) {
			User temp = list.get(i);
				System.out.println(i+1+"번 ----------");
				System.out.println("이름 : "+temp.getName());
				System.out.println("나이 : "+temp.getAge());
				System.out.println("전번 : "+temp.getPhoneNum());
		}
	}
	
	
	
	
}
