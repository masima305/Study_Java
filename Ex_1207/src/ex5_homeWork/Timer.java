package ex5_homeWork;

public class Timer implements Runnable{
	private int time = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		outer : while (true) {
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("°á°ú... : "+time+"ÃÊ");
				break outer;
			}finally {
			}
		}
	}
}
