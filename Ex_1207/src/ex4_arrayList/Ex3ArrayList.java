package ex4_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3ArrayList {
	public static void main(String[] args) {
		//아이디 생성 : aaa
		//aaa
		//아이디 생성 : bbb
		//aaa
		//bbb
		List<String> list = new ArrayList();

		outer: while (true) {
			System.out.println("아이디를 생성해");
			System.out.println("===========================");
			String a = new Scanner(System.in).next();
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(a)) {
					System.out.println("아이디가 중복");
					continue outer;
				}
			}
			list.add(a);
			System.out.println("===========================");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
}
