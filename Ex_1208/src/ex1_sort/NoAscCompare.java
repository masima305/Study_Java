package ex1_sort;

import java.util.Comparator;

public class NoAscCompare implements Comparator<User>{
	public int compare(User a0, User a1) {
		// 숫자 오름차순
		return a0.getNo() < a1.getNo() ? -1 : a0.getNo() > a1.getNo() ? 1:0;
		//이대로 이렇게 쓴다.. 이걸로 숫자 오름차순 정렬이 다능함,
	}
}
