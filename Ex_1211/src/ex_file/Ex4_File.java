package ex_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = "c:/java_study/"+"test/abc";
		File f = new File(path);

		if (!f.exists()) {// ��ΰ� ������ �������� ������~!
			System.out.println("������ �����߽��ϴ�.");
			//f.mkdir();// �ѹ��� �Ѱ��� �������,(���� �� ���� ����.)
			f.mkdirs();// �ѹ��� �ΰ� �̻��� ������ �������.
			
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
}
