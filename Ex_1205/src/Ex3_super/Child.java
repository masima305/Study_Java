package Ex3_super;

public class Child extends Parent{
	public Child() {
		// TODO Auto-generated constructor stub
		
		
		//super();가 숨겨져 있음.
		//부모클래스를 의미한다.
		// 부모클래스에서 파라미터를 받을때, 수퍼를 이용하여 받아줄 수 있음.
		// 자식이 생성될때 먼저 만들어진다.
		// 따라서 부모가 파라메터를 요구하는 경우에는, 자식클래스에서 super를 이용하여 파라미터를 넘겨줘야 하는 상황이 올 수도 있음
		
		System.out.println("자식 클래스의 생성자");
	}
	
	@Override
	public int getResult(int n, int m) {
		// 부모클래스가 가지고 있는 getResult를 호출하세요
		//인아 우리 밥 머먹엉?
				
		return super.getResult(n, m);
	}
	public void setNum(int n) {
		super.num = n;//부모클래스에 값을 집어넣을때도 쓴다.
		
	}
	 
}
