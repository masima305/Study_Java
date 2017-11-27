package Ex_work;

import java.util.Scanner;

public class ExNumMagic {
	public static void main(String[] args) {
		String num_list1 = "04 05 06 07 12 13 14 15 20 21 22 23 28 29 30";
		String num_list2 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
		String num_list3 = "01 03 05 07 09 11 13 15 17 19 21 23 25 27 29";
		String num_list4 = "08 09 10 11 12 13 14 15 24 25 26 27 28 29 30";
		String num_list5 = "02 03 06 07 10 11 14 15 18 19 22 23 26 27 30";
		
		int flag = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("다음의 숫자중에 생각하신 숫자가 있습니까? : Yes = 1 or No = 2");
		System.out.println(num_list1);
		flag = scanner.nextInt();
		if (flag == 1) {
			count += 4;
		}
		System.out.println("다음의 숫자중에 생각하신 숫자가 있습니까? : Yes = 1 or No = 2");
		System.out.println(num_list2);
		flag = scanner.nextInt();
		if (flag == 1) {
			count += 16;
		}
		System.out.println("다음의 숫자중에 생각하신 숫자가 있습니까? : Yes = 1 or No = 2");
		System.out.println(num_list3);
		flag = scanner.nextInt();
		if (flag == 1) {
			count += 1;
		}
		System.out.println("다음의 숫자중에 생각하신 숫자가 있습니까? : Yes = 1 or No = 2");
		System.out.println(num_list4);
		flag = scanner.nextInt();
		if (flag == 1) {
			count += 8;
		}
		System.out.println("다음의 숫자중에 생각하신 숫자가 있습니까? : Yes = 1 or No = 2");
		System.out.println(num_list5);
		flag = scanner.nextInt();
		if (flag == 1) {
			count += 2;
		}
		
		
		
		
		if (count > 30 || count < 0) {
			System.out.println("다시 하세용...");
		}else {
			System.out.println("당신이 생각한 숫자는 :"+count);
		}
		
	}
}
