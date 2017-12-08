package ex1_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		List<User> arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		outer : while(true) {
			System.out.print("id : ");
			String id = sc.next();
			for (int i = 0; i < arr.size(); i++) {
		
				if ( id.equals(arr.get(i).getId())){
					System.out.println("아이디 중복 다시 입력하세요");
					continue outer;
				}
			}
			

			System.out.print("pass : ");
			int pass = sc.nextInt();
			
			
			User user = new User();
			
			user.setId(id);
			user.setPwd(pass);
			
			arr.add(user);
			
			
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("===============================================");
			}
		}	
	}
}
