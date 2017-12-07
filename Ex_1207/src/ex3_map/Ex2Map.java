package ex3_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2Map {
	public static void main(String[] args) {
	//id를 입력하세요 .. : 값받음.
	// password를 입력하세요 : 값받음.
	// 결과
	// 아이디가 존재하지 않습니다.
	// 비밀번호가 존재하지 않습니다.
	//	로그인 성공
		
		HashMap<String, Integer> map = new HashMap();
		Scanner s = new Scanner(System.in);
		map.put("Kim", 1111);
		map.put("Lee", 2222);
		map.put("Park", 3333);
		while (true) {
			System.out.println("아이디를 입력하세요");
			String id = s.next();
			System.out.println("비밀번호를 입력하세요");
			int pass = s.nextInt();
			if (map.containsKey(id)){
				if (map.get(id) == pass) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("아이디가 일치하지 않습니다.");
			}
			System.out.println("=======================================d");
		}
	
	}//main
}
