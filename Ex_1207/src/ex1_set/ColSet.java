package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class ColSet {

	public static void main(String[] args) {
		//Set은 java.util패키지 안에 존재하는 인터페이스이다.
		//특정 코드에서 중복된 값을 허용해서는 안될때 사용한다.
		//가장 많이 사용하는 HashSet과 TreeSet클래스가 존재.

		HashSet<Integer> hs = new HashSet();

		while(true) {
				int r = new Random().nextInt(20)+1;
		hs.add(r);
		
		if(hs.size() == 6)
			break;
		}
		System.out.println( hs );
		//while문을 반복하면서 해쉬에 집어넣는다.
		System.out.println("----------------");
		TreeSet<Integer> ts = new TreeSet();
		while(true) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);
			if (ts.size() == 6)
				break;
		}
		System.out.println(ts);
		System.out.println(ts.subSet(10, 30));//특정 범위에 있는 수를 가려낼 수 있음.
	}	
}
