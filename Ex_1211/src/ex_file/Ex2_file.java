package ex_file;

import java.io.File;

public class Ex2_file {
	public static void main(String[] args) {
		String path = "c:/java_study";
		File f = new File(path);
		String list [];
		//������ ������ϵ� �̸��� �� ������ �ò���.
		
		if(f.isDirectory()) {//����̱⸸ �ϴٸ�
			//���丮 �ȿ��ִ� ���� ��ҵ��� �̸��� ��� �����´�.
			String [] names = f.list();
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
		}
	}
}
