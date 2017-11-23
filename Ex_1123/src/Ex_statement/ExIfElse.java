package Ex_statement;

public class ExIfElse {
	
	public static void main(String[] args) {
	
		int age = 30;
		String str;
		/*
		if (age >= 30) {
			System.out.println("드실만큼 드셨군요");
		}else{
			System.out.println("더 드세요");
		}
		System.out.println("감사합니다.");
	*/
		str = age >= 30 ? "드실만큼 드셨군요" : "더 드세요";
		System.out.println(str);
		System.out.println("감사합니다.");
		

	}
}
