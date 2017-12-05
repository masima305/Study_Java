package Ex_string;

public class Ex2StringMethod {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		// String 클래스의 메서드들
		
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		int index = str.indexOf('g'); //문장에서 맨 처음 g의 위치를 반환한다.
		int index2 = str.lastIndexOf('g'); //문장에서 맨 마지막 g의 위치를 반환한다.
		int index3 = str.indexOf("Gil"); // "Gil"의 시작 위치
		
		char a = str.charAt(5); //글자 1개 추출
		System.out.println("추출한 문자 : "+ a );
		
		String as = str.substring(1, 7); //1 부터 7까지의 문자 추출
		String test = "Apple";
		if (test.equalsIgnoreCase("apple")) {//대소문자 없이 값 비교해준다.
			System.out.println("값이 같습니다.");
		}
		
		String name = " 홍길동 ";
		System.out.println(name.length());
		String name2 = name.trim();
		System.out.println(name2.length());
		
		String num = "100";
		int numd = Integer.parseInt(num);
		
	}
}
