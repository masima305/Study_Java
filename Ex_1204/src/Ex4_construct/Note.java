package Ex4_construct;

public class Note {
	private String name = "�Ϲݳ�Ʈ";
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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+price);
		System.out.println("������ : "+page);
	}
	
	
	
}
