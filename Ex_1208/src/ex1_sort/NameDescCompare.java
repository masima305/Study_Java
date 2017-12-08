package ex1_sort;

import java.util.Comparator;

public class NameDescCompare implements Comparator<User>{
	@Override
	public int compare(User a0, User a1) {
		// TODO Auto-generated method stub
		return a1.getName().compareTo(a0.getName());
		//이대로 이렇게 쓴다.. 이걸로 오름차순 정렬이 다능함,
	}
}
