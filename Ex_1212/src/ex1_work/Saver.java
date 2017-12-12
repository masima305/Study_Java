package ex1_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver {
	
	public Saver(User a) throws IOException {
		String path = "c:/java_study/RspGame/"+a.getId()+"/Rsp.sav";
		File dir = new File("c:/java_study/RspGame/"+a.getId());
		
		if(!dir.exists())
			dir.mkdirs();
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(a);
			System.out.println("기록 저장됨");
		} catch (Exception e) {
			System.out.println("기록 저장실패");
			// TODO: handle exception
		}finally {
			if(oos != null)oos.close();
			if(fos != null)fos.close();
		}
		
		
		
	
	}

}
