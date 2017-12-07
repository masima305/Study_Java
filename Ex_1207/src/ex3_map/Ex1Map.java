package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1Map {
	public static void main(String[] args) {
		//map은 키와 값을 묶어서 하나의 데이터로 저장
		//key를 통해 value를 검색할 수 있으므로 많은 양의 데이터를 검색하는데 뛰어난 성능을 발휘한다.

		Map<String, Boolean> map1 = new HashMap();
		map1.put("key1", true);
		//키값을 중복해서 쓰면 더 나중에 추가한 값으로 자동갱신됨
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
