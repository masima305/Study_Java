package ex1_work;

import java.io.Serializable;

public class User implements Serializable{
	//객체를 통째로 저장하기 위해 시리얼라이저블을 통한 객체의 직렬화가 필수적이다.
	//메모리에 존재하는 변수들을 한번에 쓰고 받을 수 있도록 새로운 메모리 영역에 일렬로 만들어서 복사해둔다.
	//시리얼라이저블은 나의 정보를 직렬화 해주세요 라는 의미를 가지고 있다,.
	
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
		System.out.print(winCount+"승 ");
		System.out.print(drwCount+"무 ");
		System.out.println(losCount+"패 ");
	}
}
