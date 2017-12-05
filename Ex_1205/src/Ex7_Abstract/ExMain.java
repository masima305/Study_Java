package Ex7_Abstract;

public class ExMain {
	public static void main(String[] args) {
		// 상속받은 자식 클래스에게 상속을 강제함.
		// 부모클래스의 설계 단계에서 하위클래스에 필수적으로 구현해야 한다면 추상으로 구현함
		
		ExAbsChild ch = new ExAbsChild();
		ch.setValue(2);
		System.out.println(ch.getValue());

		//추상클래스는 인스턴스를 직접적으로 가질 수 없으므로
		//추상클래스를 직접 객체화 하지는 않는다.
		
		
		ExAbs na = new ExAbs() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
