package ex4_arrayList;

import java.util.List;
import java.util.ArrayList;

public class Ex1ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList(); //<-- �� ��ȣ�ϴ� �����̼�
		list.add(100);
		list.add(200);
		list.add(100);
		//Ư�� �ε����� ����
		list.remove(1);
		//���ϴ� �ε����� �� �߰�
		list.add(1,300);
		list.add(0,400);
		//
		list.set(3, 500);
		
	System.out.println(list);	
	}
}
