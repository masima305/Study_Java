package ex1_sort;

import java.util.Comparator;

public class NoAscCompare implements Comparator<User>{
	public int compare(User a0, User a1) {
		// ���� ��������
		return a0.getNo() < a1.getNo() ? -1 : a0.getNo() > a1.getNo() ? 1:0;
		//�̴�� �̷��� ����.. �̰ɷ� ���� �������� ������ �ٴ���,
	}
}
