package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1Map {
	public static void main(String[] args) {
		//map�� Ű�� ���� ��� �ϳ��� �����ͷ� ����
		//key�� ���� value�� �˻��� �� �����Ƿ� ���� ���� �����͸� �˻��ϴµ� �پ ������ �����Ѵ�.

		Map<String, Boolean> map1 = new HashMap();
		map1.put("key1", true);
		//Ű���� �ߺ��ؼ� ���� �� ���߿� �߰��� ������ �ڵ����ŵ�
		map1.put("key2", false);
		map1.put("key2", true);
		
		boolean result = map1.get("key2");
		System.out.println(result);
		
		System.out.println("=========================================================");
		HashMap<Integer, Integer> map2 = new HashMap();
		map2.put(0, 100);
		map2.put(1, 200);
		map2.put(2, 300);
		
		if (map2.containsKey(2)) {
			int r = map2.get(2);
			System.out.println(r);
		}
		
	}
}
