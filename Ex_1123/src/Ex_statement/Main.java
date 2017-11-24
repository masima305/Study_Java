package Ex_statement;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		/*신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다.
		 *  한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.
		 *  예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자. 
		 *  1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과
		 *  6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
		 *  하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.
		 *  어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 
		 *  컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 
		 *  1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.
		 *  입력
		 *  첫째 줄에는 컴퓨터의 수가 주어진다. 
		 *  컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 
		 *  둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 
		 *  이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.
		 *  
		 *  1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.
		 *  -> 수 두개를 받고, 1번과 연결이 되어있으면 배열에 추가.
		 *  -> 배열의 갯수는 최대 컴퓨터 갯수 -1.
		 *  -> 처음에 숫자 2개를 받고 인덱스 +1. 받으면서 바로 연산.
		 *  -> 1과 직접 연결되어 있는 컴퓨터는 1티어에 할당하고 
		 *  ->
		 *  */
		
		
		
		int coumputer_num = scanner.nextInt(); // 컴퓨터 갯수
		int connect_input_count = scanner.nextInt(); // 연결된 컴퓨터의 수.
		int [] connect_teir = new int [coumputer_num-1]; // 감염원의 탑 티어인 1번 컴퓨터를 제외한 나머지 연결티어들의 수.
		int [][] connect_list = new int [connect_input_count][2];
		int tier_count = 0; //계층카운트.
		
		for (int i = 0; i < connect_input_count ; i ++) {
			
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			
			
			
			/*connect_list[i][0] = scanner.nextInt();
			connect_list[i][1] = scanner.nextInt();
			 비교해서 그전 티어에 있는 값이 포함되면
			 티어카운트 올라가고 배열 시작.
			 */
		}
		
		
		
	}
}
