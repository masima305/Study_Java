package ex_string_buffer;

public class Ex_StringBuffer {
	public static void main(String[] args) {
		String name="ȫ�浿";
		name += "�ȳ�";
		System.out.println(name);
		
		StringBuffer buf_name = new StringBuffer();
		StringBuffer buf_name2 = new StringBuffer();
		
		
		
		buf_name.append("ȫ�浿");
		buf_name.append("�ȳ�");
		System.out.println(buf_name);
		String buf = buf_name.toString();
		buf_name2 = buf_name.reverse();
		String buf2 = buf_name2.toString(); 
		System.out.println(buf2);
	}
}
