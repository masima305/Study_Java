package Ex_statement;
import java.util.Scanner;

public class Ex_work {
	public static void main(String[] args) {
		//5월은 31일까지 있습니다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : ");
		
		int mon = scanner.nextInt();
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
		scanner.close();
		System.out.println(mon+"월은 "+day+"일 까지 있습니다.");	
	}
}
