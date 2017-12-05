package Ex6_Generic;

public class GenMain {
	public static void main(String[] args) {
		Gen g1 = new Gen();
		
		Integer [] iArr = {1,2,3,4,5};
		g1.printArray(iArr);
		Character [] cArr = {'A','B','C','D','E'};
		g1.printArray(cArr);
		
	}
}
