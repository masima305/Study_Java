package ex7_runnable;

public class RunnableMain {
	public static void main(String[] args) {
		RunnableTest r = new RunnableTest();
		Thread t = new Thread(r); //러너블을 쓸때는 새로운 스레드를 만들어서 집어넣어줘야함.
		//러너블과 같은 경우에 상속을 아직 사용하지 않았기때문에
		//향후 리팩터때 기회를 하나 더 보장할 수 있음.
		
		t.start();
	}
}
