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
		System.out.println("====정보추가====");
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("나이 : ");
		age = scanner.next();
		System.out.print("전화번호 : ");
		phoneNum = scanner.next();
	
		User user = new User(name,age, phoneNum);
		list.add(user);
		System.out.println("====정보저장됨====");	
	}
	public void delete() {
		System.out.println("====정보삭제====");
		System.out.print("삭제할 사람 : ");
		name = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				System.out.println("===="+name+"정보삭제====");
			} 
		}
	}
	public void showInfo() {
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
