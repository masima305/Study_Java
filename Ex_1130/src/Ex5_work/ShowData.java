package Ex5_work;

public class ShowData {
	public String shape = "";
	
	public void show(int [] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(i+"ÀÇ °¹¼ö");
			for (int j = 0; j < a[i]; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}	
	}
}
