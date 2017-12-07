package ex4_arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("선우길동");
		list.add("독고길동");
		list.add("남궁길동");
		list.add("변길동");
		
		list.set(1, "김길동");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
