package ex2_try_catch;

public class TryCatch {
	public static void main(String[] args) {
	//예외처리
		//자바에서 프로그램이 실행되는 도중 예외가 발생하면
		//그 시점에서 프로그램이 강제적으로 종료된다.
		//이것은 올바른 판단이지만, 때로는 예상할 수 있는 가벼운 
		//오류가 있거나 예외 발생시에도 강제종료하지 않고 이후의
		//작업물을 확인하고자 할때가 있다.
		//예외처리를 통해 프로그램의 ㅣㅂ정상적인 종료를 줄이고
		//정상적으로 프로그램이 계속 진행될 수 있도록 할 수 있다.
		int n = 0;
		int result = 0;
		try {
			result = 10/n;
		} catch (ArithmeticException e1) {
			System.out.println("오류발생");
			e1.printStackTrace();
		}catch (StringIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}finally {
			System.out.println(result);
		}
		
		
	}
}
