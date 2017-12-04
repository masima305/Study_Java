package Ex_string;

import java.util.Scanner;

public class Ex6String {
	public static void main(String[] args) {
		String [][] actor = {{"[송강호]","박쥐","괴물","관상"},	
							 {"[전지현]","도둑들","엽그","BHC"},						
							 {"[김수현]","도둑들","리얼","은위"}};
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("배우를 검색하세요");
		String name = scanner.next();
		int flag = 0;
		for (int i = 0; i < actor.length; i++) {
			if (actor[i][0].substring(1, actor[i][0].length()-1).equals(name)){
				System.out.println(actor[i][0]+"님의 필모그라피");
				flag = 1;
				for (int j = 1; j < actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
			}
		}
		if (flag == 0) {
			System.out.println("검색결과가 없습니다.");
		}
	}
}
