package Ex4_work;

public class Cal {
	private int result=0;
	
	public int getResult(int a, int b, String c){
		
		if (c.equals("+")){
			result = a+b;
		}else if (c.equals("-")){
			result = a-b;
		}else if (c.equals("*")){
			result = a*b;
		}else if (c.equals("/")){
			result = a/b;
		}
		
		return result;
	}
}
