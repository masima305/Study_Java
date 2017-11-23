package Ex_statement;

public class ExSwitch1 {
	public static void main(String[] args) {
		// switch-case 문
				// if 문과 유사한 구조지만 특정 값을 바로 찾아 들어감으로써
				// 처리속도에 이득을 볼 수 있는 제어문
				
				/*
				 * switch (key) {
				case value:
					
					break;

				default:
					break;
				}*/
		
		int key = 0;
		
		switch (key) {
		case 0:
			System.out.println("yeeee");
			break;
			
		case 1:
			System.out.println("회원가입");
			break;
				
		case 2:
			System.out.println("2.로그인");
			break;

		default:
			System.out.println("2.디아블로란?");
			break;
		}
	}
}
