package ex_demotion;

public class Ex3Operator {
	public static void main(String[] args) {
		// ����������
		// �񱳿�����
		int age = 20;
		int limit = 25;
		
		boolean result = limit - age >= 5 && age > 20;
		System.out.println(result);
		System.out.println();
		int n1 = 10;
		int n2 = 20;
		
		result = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println(result);
		System.out.println(!result); //<- ����� �ٷ� �տ� not �������� ����� �����ϴ�. ���� �������̱� ������.

		// ������ �׻� ������ �ִ� �κк��� �����Ѵ�.
		
	
	}
}