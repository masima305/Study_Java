package Ex8_extends;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.getCar());
		
		Parent p1 = new Parent();
		// 부모가 보유한 재산의 일부를 자식이 물려받는것을 상속이라고 한다.
		// 자식은 부모의 재산을 마음대로 사용할 수 있음.
		// 하지만 부모는 자식의 재산을 마음대로 사용할 수 없음.
		// 차일드는 부모를 통해서 만들어진 객체
		// 차일드는 곧 부모라도 한다.
		
		if (c1 instanceof Parent) {
			
		} 
	}
}
