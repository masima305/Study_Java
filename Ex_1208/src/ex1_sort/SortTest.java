package ex1_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList();
		User user = new User();
		
		user.setName("��浿");
		user.setNo(1);
		users.add(user);
		
		user = new User();
		user.setName("�ڿ���");
		user.setNo(2);
		users.add(user);
		
		user = new User();
		user.setName("�豤��");
		user.setNo(3);
		users.add(user);
		
		System.out.println("====���� �� =======");
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====���� ��������=======");
		Collections.sort(users,new NameAscCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====���� ����=======");
		Collections.sort(users,new NameDescCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====���� ����=======");
		Collections.sort(users,new NoAscCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
	}
}
