package Ex_overload;

public class Ex1OverloadMain {
	/*
	 * �����ε��� �޼����� �ߺ�����
	 * �ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡 ������ ���� �Ǵ°��� ����.
	 * �����ε��� ���� �޼��� ���� ��ҹ��ڸ� ����Ͽ� �ݵ�� ��ġ�ؾ� �Ѵ�.
	 * 
	 * �����ε��� ���� �޼������ ��ҹ��ڸ� ����Ͽ� �ݵ�� ��ġ�ؾ� �Ѵ�.
	 * ���ڵ��� ���ڸ��� ������ ������ ���� �ٸ���, ������ ���� ���ٸ� ������ �ڷ����� �ٸ���, ���� �޼����� ����Ÿ���� �ٸ��� ���ǵǾ�� �Ѵ�
	 * 
	 * */
	
	public static void main(String[] args) {
		Ex1Overload over = new Ex1Overload();
		over.getResult();
		over.getResult(1);
		over.getResult((char)1);
		over.getResult("sss");
		over.getResult("sss",1);
		over.getResult(1,"sss");		
		System.out.println();
	}
}
