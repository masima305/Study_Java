package ex_demotion;

public class Ex3Operator {
	public static void main(String[] args) {
		// 논리연산자
		// 비교연산자
		int age = 20;
		int limit = 25;
		
		boolean result = limit - age >= 5 && age > 20;
		System.out.println(result);
		System.out.println();
		int n1 = 10;
		int n2 = 20;
		
		result = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println(result);
		System.out.println(!result); //<- 결과값 바로 앞에 not 연산으로 사용이 가능하다. 단항 연산자이기 때문에.

		// 연산은 항상 좌측에 있는 부분부터 시작한다.
		
	
	}
}
