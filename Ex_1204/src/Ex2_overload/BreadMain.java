package Ex2_overload;

public class BreadMain {
	public static void main(String[] args) {
		Bread bread = new Bread();
		bread.makeBread();
		System.out.println("------------------");
		bread.makeBread(2);
		System.out.println("------------------");
		bread.makeBread("ũ��",2);
		System.out.println("------------------");
		bread.makeBread("���ڼҶ�",2);
		System.out.println("------------------");
		
	}
}
