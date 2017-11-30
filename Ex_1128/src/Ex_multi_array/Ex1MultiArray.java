package Ex_multi_array;

public class Ex1MultiArray {
	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열이 3개 모이면 3차원 배열..
		// 1차원 배열이 4개 모이면 4차원...
		// 등등등...
		
		
		String [] t = {"a","b"};
		String [][] test = {{"영희", "j:100","a:95"},
							{"철수","j:25"},
							{"맹구", "j:50","a:21"}};
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
