package Ex_continue;

public class ExContinue {
	//continue문 : 반복문 내에서 특정 문장을 건너뛰고자 할 때 사용하는 구문.
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
					//컨틴뉴 만나면 아래쪽에 있는 코드는 실행하지 않고 바로 그다음 루틴으로 간다.
				}
				
				System.out.printf("%d", j);
				
			}
			
			System.out.println();
		}
	}
}
