package Ex_statement;

public class ExSwitch1 {
	public static void main(String[] args) {
		// switch-case ��
				// if ���� ������ �������� Ư�� ���� �ٷ� ã�� �����ν�
				// ó���ӵ��� �̵��� �� �� �ִ� ���
				
				/*
				 * switch (key) {
				case value:
					
					break;

				default:
					break;
				}*/
		
		int key = 0;
		
		switch (key) {
		case 0:
			System.out.println("yeeee");
			break;
			
		case 1:
			System.out.println("ȸ������");
			break;
				
		case 2:
			System.out.println("2.�α���");
			break;

		default:
			System.out.println("2.��ƺ�ζ�?");
			break;
		}
	}
}
