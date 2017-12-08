package ex1_work;

public class User {
	private String name;
	private String age;
	private String phoneNum;
	
	public User(String name, String age, String phoneNum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
}
