package Ex4_construct;

public class Note {
	private String name = "일반노트";
	private int price = 1000;
	private int page = 100;
	
	
	public Note() {
		
	}
	public Note(String name, int price, int page) {
		this.name = name;
		this.price = price;
		this.page = page;
	}
	
	public void noteInfo() {
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("페이지 : "+page);
	}
	
	
	
}
