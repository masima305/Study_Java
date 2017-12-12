package ex1_work;

public class Loader {
	private User a;
	
	public Loader(User user) {
		this.a = user;
		String path = "c:/java_study/RspGame/"+a.getId()+"/Rsp.sav";
		
	}
	public User getUser() {
		return a;
	}
}
