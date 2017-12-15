package ex_sync;

public class Ex_Synchronized implements Runnable{

	private int money = 10000;

	@Override
	public void run() {

		//싱크로나이즈드 영역이 마무리 될때까지 다른 스레드에서 접근하지 못하게 한다.
		synchronized (Ex_Synchronized.this){
						// ㄴor 그냥 this라고 써도 괜춘

			for(int i = 0; i < 10 ; i++) {

				try {
					Thread.sleep(500);	
					withdraw(1000);
				} catch (Exception e) {
				}//TC
			}//for

		}


	}//run()

	public void withdraw(int m) {
		//현재 구동중인 스레드의 이름을 가져온다.
		String threadName = Thread.currentThread().getName();

		//잔액이 0원 이상일때 출력할수 있게 함.
		if(getMoney() > 0) {

			money -= m;
			System.out.println(threadName + "잔액"+money+"원");
		}else{
			System.out.println(threadName + "잔액부족");
		}//if
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
