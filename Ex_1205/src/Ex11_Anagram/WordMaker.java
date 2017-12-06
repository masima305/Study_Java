package Ex11_Anagram;

import java.util.Random;

public class WordMaker {
	private String [] list = {"APPLE","ORANGE","HOPE","VIEW","CHANGE"};
	private char [] anagram;
	private int anaNum[];
	
	
	public String pickWord() {
		return list[new Random().nextInt(list.length)]; 
	}
	
	public int[] makeAnagram(String a){
		this.anagram = a.toCharArray();
		int n = anagram.length;
		this.anaNum = new int [anagram.length]; 
		
		for (int i = 0; i < anaNum.length; i++) {
			int temp = new Random().nextInt(n);

			for (int j = 0; j < i; j++) {
				if (temp == anaNum[j]) {
					temp = new Random().nextInt(n);
					j = -1;
				}
			}	
			anaNum[i]=temp;
		}
		return anaNum;
	}
	
	public void checkAnswer(String a, String b) {
		if (a.equalsIgnoreCase(b)) {
			System.out.println(a+"정답입니다");
		}else {
			System.out.println(a+"오답입니다.");
		}
	}
}
