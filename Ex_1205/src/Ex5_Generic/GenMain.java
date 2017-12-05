package Ex5_Generic;

public class GenMain {
	public static void main(String[] args) {
		//제너릭은 걱쇠안에 타입을 넣어줄 수 있음. 근데 기본 자료형은 못넣어주고 클래스만 넣을 수 잇음
		//상황에 맞게 그때그때 타입을 지정해서 넣어준다.
		//클래스의 타입또한 넣어줄 수 있음.
		ExGen<String> v1 =  new ExGen<String>();
		v1.setValue("A");
		v1.setValue("안녕");
		
		ExGen<Integer> v2 =  new ExGen<Integer>();
		v2.setValue(10);
		int a = v2.getValue();
		

		ExGen<Character> v3 =  new ExGen<Character>();
		v3.setValue('2');
		char c = v3.getValue();
		
		
		
		
	}
}
