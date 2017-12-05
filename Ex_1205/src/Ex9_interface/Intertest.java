package Ex9_interface;

public interface Intertest {
	//저장할 수 있는 자료의 상태가 상수, 추상메서드 말고는 아무것도 집어넣을 수 없음.
	
	final int VALUE = 100; //상수는 항상 대문자로 뜬다.
	abstract int getVALUE(); //강제로 항상 써야하는것을 쓴다.
	
}
