package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class ColSet {

	public static void main(String[] args) {
		//Set�� java.util��Ű�� �ȿ� �����ϴ� �������̽��̴�.
		//Ư�� �ڵ忡�� �ߺ��� ���� ����ؼ��� �ȵɶ� ����Ѵ�.
		//���� ���� ����ϴ� HashSet�� TreeSetŬ������ ����.

		HashSet<Integer> hs = new HashSet();

		while(true) {
				int r = new Random().nextInt(20)+1;
		hs.add(r);
		
		if(hs.size() == 6)
			break;
		}
		System.out.println( hs );
		//while���� �ݺ��ϸ鼭 �ؽ��� ����ִ´�.
		System.out.println("----------------");
		TreeSet<Integer> ts = new TreeSet();
		while(true) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);
			if (ts.size() == 6)
				break;
		}
		System.out.println(ts);
		System.out.println(ts.subSet(10, 30));//Ư�� ������ �ִ� ���� ������ �� ����.
	}	
}
