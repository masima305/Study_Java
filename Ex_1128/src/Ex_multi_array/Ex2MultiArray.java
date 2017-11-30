package Ex_multi_array;

public class Ex2MultiArray {
	public static void main(String[] args) {
		int arr [][] = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20,22},
						};
		int total = 0;
		int count = 0;
		float average = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		
		average = total / count;
		System.out.println(total);
		System.out.println(average);
	}
}
