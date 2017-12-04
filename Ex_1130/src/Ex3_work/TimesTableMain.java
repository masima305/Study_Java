package Ex3_work;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("출력할 단 : ");
		Scanner scanner = new Scanner(System.in);
		TimesTable table = new TimesTable();
		table.showTable(scanner.nextInt());
	}

}
