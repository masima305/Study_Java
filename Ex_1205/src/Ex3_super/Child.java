package Ex3_super;

public class Child extends Parent{
	public Child() {
		// TODO Auto-generated constructor stub
		
		
		//super();�� ������ ����.
		//�θ�Ŭ������ �ǹ��Ѵ�.
		// �θ�Ŭ�������� �Ķ���͸� ������, ���۸� �̿��Ͽ� �޾��� �� ����.
		// �ڽ��� �����ɶ� ���� ���������.
		// ���� �θ� �Ķ���͸� �䱸�ϴ� ��쿡��, �ڽ�Ŭ�������� super�� �̿��Ͽ� �Ķ���͸� �Ѱ���� �ϴ� ��Ȳ�� �� ���� ����
		
		System.out.println("�ڽ� Ŭ������ ������");
	}
	
	@Override
	public int getResult(int n, int m) {
		// �θ�Ŭ������ ������ �ִ� getResult�� ȣ���ϼ���
		//�ξ� �츮 �� �ӸԾ�?
				
		return super.getResult(n, m);
	}
	public void setNum(int n) {
		super.num = n;//�θ�Ŭ������ ���� ����������� ����.
		
	}
	 
}
