package Ex_string;

public class Ex2StringMethod {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		// String Ŭ������ �޼����
		
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		int index = str.indexOf('g'); //���忡�� �� ó�� g�� ��ġ�� ��ȯ�Ѵ�.
		int index2 = str.lastIndexOf('g'); //���忡�� �� ������ g�� ��ġ�� ��ȯ�Ѵ�.
		int index3 = str.indexOf("Gil"); // "Gil"�� ���� ��ġ
		
		char a = str.charAt(5); //���� 1�� ����
		System.out.println("������ ���� : "+ a );
		
		String as = str.substring(1, 7); //1 ���� 7������ ���� ����
		String test = "Apple";
		if (test.equalsIgnoreCase("apple")) {//��ҹ��� ���� �� �����ش�.
			System.out.println("���� �����ϴ�.");
		}
		
		String name = " ȫ�浿 ";
		System.out.println(name.length());
		String name2 = name.trim();
		System.out.println(name2.length());
		
		String num = "100";
		int numd = Integer.parseInt(num);
		
	}
}
