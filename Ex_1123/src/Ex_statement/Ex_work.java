package Ex_statement;

import java.lang.invoke.SwitchPoint;

public class Ex_work {
	
	public static void main(String[] args) {
		//5월은 31일까지 있습니다.
		int mon = 5;
		int day = 0;
		
		switch (mon) {
		case 1:
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:
		case 12:
			day = 31;
			break;
		case 4:	
		case 6:	
		case 9:	
		case 11:
			day = 30;
			break;
		case 2:
			day=28;
		default:
			day=0;
			break;
	
		}
	}
}
