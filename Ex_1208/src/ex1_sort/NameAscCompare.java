package ex1_sort;

import java.util.Comparator;

public class NameAscCompare implements Comparator<User>{

	@Override
	public int compare(User a0, User a1) {
		// TODO Auto-generated method stub
		return a0.getName().compareTo(a1.getName());
		//�̴�� �̷��� ����.. �̰ɷ� �������� ������ �ٴ���,
		
	}
	
}
