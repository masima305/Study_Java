package work;

public class Work {
	public static void main(String[] args) {
		/*
		 * 과수원이 있음 배 사과 오렌지 키우는데 하루에 생산되는 과일의 양은 5,7,5개. 
		 * 총 하루에 생산하는 과일의 총 개수.
		 * 시간당 전체 과일의 평균 생산 개수
		 * 단, 과일의 총 개수를 담을 변수는 int 로
		 * 평균생산개수를 담을 변수는 float으로 만들라.
		 * */
	
	int apple  = 5;
	int pear = 7;
	int orange = 5;
	
	int totalPerDay = apple + pear + orange;
	float averagePerHour = totalPerDay/24f;
	
	System.out.printf("하루에 총 생산되는 량은 %d, 시간당 평균 성장량은 %f", totalPerDay, averagePerHour);
	System.out.println();
	System.out.println("하루에 총 생산되는 량은"+totalPerDay+" 시간당 평균 성장량은"+averagePerHour);
	// 소수점 이하 끊어서 쓰는거.
	// printf("%.2f", averagePerHour)
	
	
	
	}
}
