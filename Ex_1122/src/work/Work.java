package work;

public class Work {
	public static void main(String[] args) {
		/*
		 * �������� ���� �� ��� ������ Ű��µ� �Ϸ翡 ����Ǵ� ������ ���� 5,7,5��. 
		 * �� �Ϸ翡 �����ϴ� ������ �� ����.
		 * �ð��� ��ü ������ ��� ���� ����
		 * ��, ������ �� ������ ���� ������ int ��
		 * ��ջ��갳���� ���� ������ float���� �����.
		 * */
	
	int apple  = 5;
	int pear = 7;
	int orange = 5;
	
	int totalPerDay = apple + pear + orange;
	float averagePerHour = totalPerDay/24f;
	
	System.out.printf("�Ϸ翡 �� ����Ǵ� ���� %d, �ð��� ��� ���差�� %f", totalPerDay, averagePerHour);
	System.out.println();
	System.out.println("�Ϸ翡 �� ����Ǵ� ����"+totalPerDay+" �ð��� ��� ���差��"+averagePerHour);
	// �Ҽ��� ���� ��� ���°�.
	// printf("%.2f", averagePerHour)
	
	
	
	}
}