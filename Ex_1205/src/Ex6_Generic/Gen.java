package Ex6_Generic;

public class Gen<T> {
	
	
	public void printArray(T t[]) {
		T list [] = t;
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	
}
