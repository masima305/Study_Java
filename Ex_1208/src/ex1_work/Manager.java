package ex1_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	private List<User> list = new ArrayList();
	Scanner scanner = new Scanner(System.in);

	String name;
	String age;
	String phoneNum;
	
	public void insert() {
		System.out.println("====�����߰�====");
		System.out.print("�̸� : ");
		name = scanner.next();
		System.out.print("���� : ");
		age = scanner.next();
		System.out.print("��ȭ��ȣ : ");
		phoneNum = scanner.next();
	
		User user = new User(name,age, phoneNum);
		list.add(user);
		System.out.println("====���������====");	
	}
	public void delete() {
		System.out.println("====��������====");
		System.out.print("������ ��� : ");
		name = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				System.out.println("===="+name+"��������====");
			} 
		}
	}
	public void showInfo() {
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
