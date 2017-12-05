package Ex7_Abstract;

public abstract class ExAbs {
	int value = 100;

	public int getValue() {
		return value;
	}
	
	//앞에 abstract 키워드로 시작해야 한다
	abstract public void setValue(int n);
	// 몸통이 없는 메서드를 추상메서드라고 한다
	// 추상 클래스는 추상 메서드를 한개라도 갖고 있으면 해당함.
	// 부모쪽에서는 이 추상메서드를 사용하지 않고, 자식이 생겼을때부터 사용할 수 있다.
	
	
}
