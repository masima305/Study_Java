package Ex7_Abstract;

public class ExAbsChild extends ExAbs{

	@Override
	public void setValue(int n) {
		// �߻�Ŭ������ ��ӹ����� �θ� �ϼ� �Ƚ�Ų �޼��带 �ݵ�� �������̵� �Ͽ� �ϼ���Ų�ٴ°� ������.
		super.value = n;
	}
	@Override
	public int getValue() {
		return super.getValue();
	}
}
