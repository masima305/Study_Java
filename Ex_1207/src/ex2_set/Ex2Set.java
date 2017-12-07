package ex2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex2Set {
	//TODO : 이터레이터 복습
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();

		for(int i = 0; hs.size() <= 5; i++){
			int r = new Random().nextInt(45)+1;
			hs.add(r);
		}
		System.out.println(hs);
		//해쉬는 인덱스가 없어서 접근이 힘들다... 그래서사용하는게 이걸 배열로 복사해서 넣는다.
		int [] a = new int[hs.size()];
		//Set 구조의 내용을 index없이 순차적으로 얻어오기 위해 Iterator라는 반복자를 사용한다
		Iterator<Integer> it = hs.iterator();
	
		for (int i = 0; i < a.length; i++) {
			a[i] = it.next();
			System.out.println(a[i]+" ");
		}
	}
}
