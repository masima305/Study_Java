package Ex5_Generic;

public class GenMain {
	public static void main(String[] args) {
		//���ʸ��� �Ƽ�ȿ� Ÿ���� �־��� �� ����. �ٵ� �⺻ �ڷ����� ���־��ְ� Ŭ������ ���� �� ����
		//��Ȳ�� �°� �׶��׶� Ÿ���� �����ؼ� �־��ش�.
		//Ŭ������ Ÿ�Զ��� �־��� �� ����.
		ExGen<String> v1 =  new ExGen<String>();
		v1.setValue("A");
		v1.setValue("�ȳ�");
		
		ExGen<Integer> v2 =  new ExGen<Integer>();
		v2.setValue(10);
		int a = v2.getValue();
		

		ExGen<Character> v3 =  new ExGen<Character>();
		v3.setValue('2');
		char c = v3.getValue();
		
		
		
		
	}
}
