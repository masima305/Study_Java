package ex_demotion;

public class Ex2Operator {
	public static void main(String[] args) {
		// 비교연산자
		boolean n ;
		int n1 = 10;
		int n2 = 20;
		
		n = n1 < n2; 
		// 비교 연산자를 코드로 표현하는 룰이 있음
		// 좌측에서 우측으로 코드리딩이 되기 때문에, 작은것이 좌측으로 가야함.
		// 의미상 주체가 되는 것들이 좌측으로 가야함.
		
		 System.out.println( n );
		 n = n1 == n2;
		 System.out.println(n1); 
		 n = n1 != n2;
		 System.out.println(n);
		 
	}
}
