package ex2_try_catch;

public class TryCatch {
	public static void main(String[] args) {
	//����ó��
		//�ڹٿ��� ���α׷��� ����Ǵ� ���� ���ܰ� �߻��ϸ�
		//�� �������� ���α׷��� ���������� ����ȴ�.
		//�̰��� �ùٸ� �Ǵ�������, ���δ� ������ �� �ִ� ������ 
		//������ �ְų� ���� �߻��ÿ��� ������������ �ʰ� ������
		//�۾����� Ȯ���ϰ��� �Ҷ��� �ִ�.
		//����ó���� ���� ���α׷��� �Ӥ��������� ���Ḧ ���̰�
		//���������� ���α׷��� ��� ����� �� �ֵ��� �� �� �ִ�.
		int n = 0;
		int result = 0;
		try {
			result = 10/n;
		} catch (ArithmeticException e1) {
			System.out.println("�����߻�");
			e1.printStackTrace();
		}catch (StringIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}finally {
			System.out.println(result);
		}
		
		
	}
}
