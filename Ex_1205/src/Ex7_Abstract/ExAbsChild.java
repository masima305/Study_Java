package Ex7_Abstract;

public class ExAbsChild extends ExAbs{

	@Override
	public void setValue(int n) {
		// 추상클래스를 상속받으면 부모가 완성 안시킨 메서드를 반드시 오버라이딩 하여 완성시킨다는게 조건임.
		super.value = n;
	}
	@Override
	public int getValue() {
		return super.getValue();
	}
}
