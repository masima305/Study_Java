package ex1_work;

import java.util.ArrayList;

public class showManager {
	
	
	public void showInfo(ArrayList<User> list) {
		System.out.println("====��ü����====");
		for (int i = 0; i < list.size(); i++) {
			User temp = list.get(i);
				System.out.println(i+1+"�� ----------");
				System.out.println("�̸� : "+temp.getName());
				System.out.println("���� : "+temp.getAge());
				System.out.println("���� : "+temp.getPhoneNum());
		}
	}
	
	
	
	
}
