package Ex11_Anagram;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WordMaker maker = new WordMaker();
		
		String word = maker.pickWord();
	
		System.out.println(word);
		int anagram [] = maker.makeAnagram(word);
		
		
		
		System.out.println("���� : ");
		for (int i = 0; i < anagram.length; i++) {
			System.out.print(word.charAt(anagram[i]));
		}
		System.out.println();
		System.out.print("���� ? : ");
		maker.checkAnswer(word, scanner.nextLine());
	}
}
