package Ex2_overload;

public class BreadMain {
	public static void main(String[] args) {
		Bread bread = new Bread();
		bread.makeBread();
		System.out.println("------------------");
		bread.makeBread(2);
		System.out.println("------------------");
		bread.makeBread("크림",2);
		System.out.println("------------------");
		bread.makeBread("초코소라",2);
		System.out.println("------------------");
		
	}
}
