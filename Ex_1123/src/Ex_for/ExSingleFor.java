package Ex_for;

public class ExSingleFor {
	public static void main(String[] args) {
		//for문, 단일 for문/
		// 특정 명령을 원하는만큼 반복적으로 사용하고자 하게 해줌. 
		for (int i = 0; i < args.length; ) {
			i++; // 이렇게 인덱스를 바깥으로 뺄 수 있음. 만약 if문과  같이 쓸 경우 조건절이 포함된 while문으로 사용이 가능하다.
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(10-i);
		}
		for(int i = 15; i > 0; i--) {
			if (i%3 == 0) {
				System.out.println(i+"는 3의 배수입니다.");
			}
		}
		
		int dan = 7;
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("\n 7 * %d = %d",i,7*i);
		}
	}
}
