package ex4_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3ArrayList {
	public static void main(String[] args) {
		//���̵� ���� : aaa
		//aaa
		//���̵� ���� : bbb
		//aaa
		//bbb
		List<String> list = new ArrayList();

		outer: while (true) {
			System.out.println("���̵� ������");
			System.out.println("===========================");
			String a = new Scanner(System.in).next();
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(a)) {
					System.out.println("���̵� �ߺ�");
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
