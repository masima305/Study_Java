package Ex_multi_array;

import java.util.Scanner;

public class Ex6MultiArray {
	public static void main(String[] args) {
		/*	마방진 만들기
		 * 	
		 * 
		 * */
		int [][] arr;
		int num = 1;
		int size = 0;
		
		int y = 0; // 행
		int x = 0; // 열
		
		Scanner s = new Scanner(System.in);
		System.out.println("홀수를 입력하세요 : ");
		size = s.nextInt();
		
		x = size/2;
		// 사용자가 지정한 사이즈로 배열의 크기 결정
		
		arr = new int [size][size];
		
		while(num <= size*size) {
			
			arr[x][y] = num;
			
			if( num % size == 0 ){
				y++;
			}else{
				y--;
				x++;
			}
			
			num++;
			
			if( y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}
			
			num++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
