package Ex4_Object;

public class ObjMain {
	public static void main(String[] args) {
	
		Object value = 4;
		// 파라미터로 들어오는 타입을 특정할 수 없을때, 오브젝트를 쓰는것도 한 방법이 될 수 있음.
		// 예를 들면 클래스 자체를 주거나 받는 상황이 될 수 있음.
		// 메모리 낭비는 있지만, 클래스 자체가 얼마의 메모리인지 특정 할 수 없으므로, 유용하다.
		// 기본 자료형의 종류중에 파라메터가 속해있으면 오버라이딩을 쓰는게 훨씬 낫고, 메모리를 특정할 수 없으면 메모리 손실을 감수하고서라도 간다.
		// IO와 같은 경우에는 OBJ가 필수적이다. 어떤 데이터를 읽을 지 모르기 때문.
		
		ExObject obj = new ExObject();
		obj.setValue(value); //오토 박싱.
		// 기본 자료형을 객체로 자동으로 만들어주는것.
		
		int num = (int) obj.getValue();
		// 객체가 기본자료형으로 바뀌는거 언박싱.
		
		obj.setValue("안녕?");
		String str = (String) obj.getValue();
		
	}
}
