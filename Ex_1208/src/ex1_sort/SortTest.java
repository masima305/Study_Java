package ex1_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList();
		User user = new User();
		
		user.setName("고길동");
		user.setNo(1);
		users.add(user);
		
		user = new User();
		user.setName("박영희");
		user.setNo(2);
		users.add(user);
		
		user = new User();
		user.setName("김광규");
		user.setNo(3);
		users.add(user);
		
		System.out.println("====정렬 전 =======");
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====문자 오름차순=======");
		Collections.sort(users,new NameAscCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====문자 내림=======");
		Collections.sort(users,new NameDescCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
		System.out.println("====숫자 오름=======");
		Collections.sort(users,new NoAscCompare());
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getNo()+ " : " + users.get(i).getName());
		}
	}
}
