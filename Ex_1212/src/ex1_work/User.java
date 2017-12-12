package ex1_work;

import java.io.Serializable;

public class User implements Serializable{
	//��ü�� ��°�� �����ϱ� ���� �ø������������ ���� ��ü�� ����ȭ�� �ʼ����̴�.
	//�޸𸮿� �����ϴ� �������� �ѹ��� ���� ���� �� �ֵ��� ���ο� �޸� ������ �Ϸķ� ���� �����صд�.
	//�ø������������ ���� ������ ����ȭ ���ּ��� ��� �ǹ̸� ������ �ִ�,.
	
	private String id;
	int winCount;
	int drwCount;
	int losCount;
	
	public User( String id) {
		this.id = id;
		winCount = 0;
		drwCount = 0;
		losCount = 0;
	}		
	public String getId() {
		return id;
	}
	public void winGame() {
		winCount++;
	}
	public void drawGame() {
		drwCount++;
	}
	public void lossGame() {
		losCount++;
	}
	public void showCount() {
		System.out.print(winCount+"�� ");
		System.out.print(drwCount+"�� ");
		System.out.println(losCount+"�� ");
	}
}
