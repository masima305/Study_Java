package ex7_runnable;

public class RunnableTest implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		// TODO Auto-generated method stub
		
	}
// 다른 클래스를 상속 받으면서 스레드를 써야하는 경우에는 이런식으로 한다.
	
}
