package Ex1_class;

public class Computer {
	//컴퓨터를 대량생산 하기위한 설계도를 작성
	
	private int hdd = 200; //하드 디스크 용량
	int ram = 512; //램 용량
	float cpu = 2.5f;
	String color = "black";
	
	// 위와같은 것들을 변수, 멤버, 속성
	
	
	
	public void getInfo() {
		System.out.println("HDD :"+hdd);
		System.out.println("RAM :"+ram);
		System.out.println("CPU :"+cpu);
		System.out.println("Color :"+color);
		
	// 메서드, 기능, 함수, 
		
	// 접근제한자
	/*
	 * public : 같은 프로젝트 내의 모든 클래스에서 사용을 허가받음
	 * private : 현재 클래스에서만 사용을 허가받음
	 * protected : 상속관계의 객체들만 사용을 허가
	 * default : 같은 패키지의 클래스에서 사용을 허가
	 * 
	 * */
	}
	
	
}
