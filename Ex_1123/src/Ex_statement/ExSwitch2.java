package Ex_statement;

public class ExSwitch2 {
	public static void main(String[] args) {
		
		String str = "��";
		String result = "";
		
		
		switch ( str) {
		case "��":
			result = "90~100";
			System.out.println("yeeee");
			break;
			
		case "��":
			result = "80~99";
			System.out.println("ȸ������");
			break;
				
		case "��":
			result = "70~89";
			System.out.println("2.�α���");
			break;
		
		case "��":
			result = "60~79";
			System.out.println("2.�α���");
			break;
			
		case "��":
			result = "~59";
			System.out.println("2.�α���");
			break;

		default:
			System.out.println("2.��ƺ�ζ�?");
			break;
		}
		System.out.println(result);
	}
}
