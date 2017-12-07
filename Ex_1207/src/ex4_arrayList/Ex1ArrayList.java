package ex4_arrayList;

import java.util.List;
import java.util.ArrayList;

public class Ex1ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList();
		List<Integer> list2 = new ArrayList(); //<-- 더 선호하는 포메이션
		list.add(100);
		list.add(200);
		list.add(100);
		//특정 인덱스를 제거
		list.remove(1);
		//원하는 인덱스에 값 추가
		list.add(1,300);
		list.add(0,400);
		//
		list.set(3, 500);
		
	System.out.println(list);	
	}
}
