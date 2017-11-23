package ex_demotion;

public class Ex6Operator {
	public static void main(String[] args) {
		// TODO 삼항연산자를 이용한 백준문제 하나 풀기
		
		// 삼항 연산자, 조건연산자. :
		// 하나의 조건을 정의하고 그 조건이 참일때와 거짓일때를 구별하여 다른 결과를 얻을 수 있게 해주는 연산자.
		
		int a = 10;
		int b = 15;
		
		boolean result =  ++a >= b ? true : false;

		// 위 공식에서 좌측 공식은 거짓이다. 그럼 false자리에 있는 값을 선언된 변수에 반환한다. 
		// 만약 참이었다면 true에 있는 값이 들어가는 것이다.
		
		int c = 10+15 == 25 ? 1 : 2;
		
		System.out.println(c);
		
		//다음과 같은 상황도 가능하다.
		char result2 = (a += b) == b ? 'O' : 'x'; 
		System.out.println(result2);
		
		System.out.println("-------------------------------");
		
		int a1 = 10;
		int a2 = 12;
		char result3 = (++a1 >= a2 || 2+7 <= a2 && 13 -a2 >= 0 && (a1 += a2) - (a1 % a2) > 10 ? 'O' : 'x');
		System.out.println(result3);
		
	
	}
}
