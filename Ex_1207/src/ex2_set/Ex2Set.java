package ex2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex2Set {
	//TODO : ���ͷ����� ����
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();

		for(int i = 0; hs.size() <= 5; i++){
			int r = new Random().nextInt(45)+1;
			hs.add(r);
		}
		System.out.println(hs);
		//�ؽ��� �ε����� ��� ������ �����... �׷�������ϴ°� �̰� �迭�� �����ؼ� �ִ´�.
		int [] a = new int[hs.size()];
		//Set ������ ������ index���� ���������� ������ ���� Iterator��� �ݺ��ڸ� ����Ѵ�
		Iterator<Integer> it = hs.iterator();
	
		for (int i = 0; i < a.length; i++) {
			a[i] = it.next();
			System.out.println(a[i]+" ");
		}
	}
}
