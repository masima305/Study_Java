package ex5_sleep;

public class threadMain {

	public static void main(String[] args) {
		ThreadSub t = new ThreadSub();
		t.start();
		
		try {
			Thread.sleep(3000);// 3초동안 강제로 쉰다.
		} catch (Exception e) {
			// TODO: handle exception
		}// 슬립을 쓰려면 꼭 예외처리로 묶어줘야 한다.
		
		System.out.println("스레끝");
	}
}
