package Ex_multi_array;

public class Ex1MultiArray {
	public static void main(String[] args) {
		// ������ �迭
		// 1���� �迭�� 3�� ���̸� 3���� �迭..
		// 1���� �迭�� 4�� ���̸� 4����...
		// ����...
		
		
		String [] t = {"a","b"};
		String [][] test = {{"����", "j:100","a:95"},
							{"ö��","j:25"},
							{"�ͱ�", "j:50","a:21"}};
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
