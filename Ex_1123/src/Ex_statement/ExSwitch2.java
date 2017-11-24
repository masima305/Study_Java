package Ex_statement;

public class ExSwitch2 {
	public static void main(String[] args) {
		
		String str = "미";
		String result = "";
		
		
		switch ( str) {
		case "수":
			result = "90~100";
			System.out.println("yeeee");
			break;
			
		case "우":
			result = "80~99";
			System.out.println("회원가입");
			break;
				
		case "미":
			result = "70~89";
			System.out.println("2.로그인");
			break;
		
		case "양":
			result = "60~79";
			System.out.println("2.로그인");
			break;
			
		case "가":
			result = "~59";
			System.out.println("2.로그인");
			break;

		default:
			System.out.println("2.디아블로란?");
			break;
		}
		System.out.println(result);
	}
}
