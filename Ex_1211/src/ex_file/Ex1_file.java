package ex_file;

import java.io.File;

public class Ex1_file {
	public static void main(String[] args) {
		//IO (Input, Output)]
		//����� ��Ʈ���� �ǹ���.
		//�����͸� ����� �ϱ����� �����.
		//JVM�� �ֿܼ��� ���� ������ Input, ���� �������� OutPut
		
		// ���� ��ü ������ ���� ���
		
		String path = "c:/java_study/test.txt";
		File f = new File(path);
		
		if(f.isFile()) {//���� Ŭ������ �����ϴ� ��ΰ� ������ ���
			System.out.println("������ ũ�� :"+f.length());//���� ũ�⸦ �� �� ����.
		}
		
		
		
		
	}
}
