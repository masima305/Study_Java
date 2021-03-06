package ex_demotion;

public class Ex4Operator {
	public static void main(String[] args) {
		
		//TODO : 비트 연산자들을 이용한 백준 문제 하나 풀기.
		// 비트연산자 와 유사하지만 2진수 단위의 연산만 가능하다.
		int a = 10;
		int b = 7;
		int c = a & b; //2진수단위의 비트연산자는 단위 1개만 쓴다.
		System.out.println("논리곱 : "+c);
		
		/* 2진수로 변경하여 비교했을 때 양쪽 다 1일 경우에만 1을 찍어준다.
		 * 
		 * 논리곱을 해서 나온값을 준다.  1010
		 * 								 1101
		 * 								-------
		 * 								 1000
		 * 둘다 1일때만 1을 찍어줌.
		 * 	
		 */
		
		int a2 = 12;
		int b2 = 8;
		int c2 = a2 | b2;
		System.out.println("논리 합 : "+c2);
		/*2진수로 변경하여 비교했을 때 양쪽 다 0일 경우에만 0을 찍어준다.
		 *		1100
		 *		1000
		 *		-----
		 *		1100 
		 * */
		
		c = a ^ b;
		System.out.println("배타적 or(xor) : " + c);
		/* 비교했을때 값이 다르면 0 같으면 1
		 * 
		 * 
		 * */

	
		// 시프트 연산자
		/* 2진수 단위의 연산을 수행하지만 오른쪽 또는 왼쪽으로 이동시켜 값에 대한 변화를 준다.
		 * 
		 * */
		
		char cf = 'F';
		int i = cf >> 1;
		
		System.out.println((char)i);
		
		/*
		 * 결과값 35.
		 * 우리가 cf에 대해서 오른쪽을 한칸씩만 이동하는 코드인데, 이걸 우선 2진수로 봐ㅑ한다.
		 * f의 아스키 코드는 70 == 1000110 이 이진수로 반환된다.
		 * 이상태에서 오른쪽으로 한칸씩 이동하면 -100011/0 <- 마지막 하나는 잘림.
		 * 그래서 값이 35가 나옴.
		 * */
		 
	}
}
