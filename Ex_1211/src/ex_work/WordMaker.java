package ex_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordMaker {
	boolean end = false;
	
	private List<String> problems = new ArrayList();
	
	private String [] words = {"apple","banana","carrot"};
	
	public void makeProblems() {
		problems.add(words[new Random().nextInt(3)]);
	}
	public void showProblems(){
		for (int i = 0; i < problems.size(); i++) {
			System.out.print("<"+problems.get(i)+">");
		}
		System.out.println();
	}
	
	public void deleteProblems(String a) {
		for (int i = 0; i < problems.size(); i++) {
			if (problems.get(i).equals(a)) {
				problems.remove(i);
			}
		}
	}
	
	public boolean isEnd() {
		if (problems.size() == 0) {
			end = true;
		}			
		return end;
	}
}
