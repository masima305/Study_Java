package Ex7_Abstract;

public class ExMain {
	public static void main(String[] args) {
		// ��ӹ��� �ڽ� Ŭ�������� ����� ������.
		// �θ�Ŭ������ ���� �ܰ迡�� ����Ŭ������ �ʼ������� �����ؾ� �Ѵٸ� �߻����� ������
		
		ExAbsChild ch = new ExAbsChild();
		ch.setValue(2);
		System.out.println(ch.getValue());

		//�߻�Ŭ������ �ν��Ͻ��� ���������� ���� �� �����Ƿ�
		//�߻�Ŭ������ ���� ��üȭ ������ �ʴ´�.
		
		
		ExAbs na = new ExAbs() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
