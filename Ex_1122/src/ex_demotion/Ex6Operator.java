package ex_demotion;

public class Ex6Operator {
	public static void main(String[] args) {
		// TODO ���׿����ڸ� �̿��� ���ع��� �ϳ� Ǯ��
		
		// ���� ������, ���ǿ�����. :
		// �ϳ��� ������ �����ϰ� �� ������ ���϶��� �����϶��� �����Ͽ� �ٸ� ����� ���� �� �ְ� ���ִ� ������.
		
		int a = 10;
		int b = 15;
		
		boolean result =  ++a >= b ? true : false;

		// �� ���Ŀ��� ���� ������ �����̴�. �׷� false�ڸ��� �ִ� ���� ����� ������ ��ȯ�Ѵ�. 
		// ���� ���̾��ٸ� true�� �ִ� ���� ���� ���̴�.
		
		int c = 10+15 == 25 ? 1 : 2;
		
		System.out.println(c);
		
		//������ ���� ��Ȳ�� �����ϴ�.
		char result2 = (a += b) == b ? 'O' : 'x'; 
		System.out.println(result2);
		
		System.out.println("-------------------------------");
		
		int a1 = 10;
		int a2 = 12;
		char result3 = (++a1 >= a2 || 2+7 <= a2 && 13 -a2 >= 0 && (a1 += a2) - (a1 % a2) > 10 ? 'O' : 'x');
		System.out.println(result3);
		
	
	}
}
