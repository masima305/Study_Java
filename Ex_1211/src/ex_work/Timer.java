package ex_work;

public class Timer implements Runnable{
	WordMaker maker = new WordMaker();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			maker.makeProblems();
			maker.showProblems();
			outer : while (true) {
				
				maker.makeProblems();
					Thread.sleep(5000);
					if(maker.isEnd() == true) {
						break outer;
					}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	public WordMaker outList () {
		return this.maker;
	}
}
