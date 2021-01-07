package work10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
	public static void main(String[] args) throws IOException{
		String a = "F:\\test\\src.txt";
		String b = "F:\\test\\desk.txt";
		try {
			File src = new File(a);
			File desk = new File(b);
			desk.createNewFile();
			FileInputStream c = new FileInputStream(src);
			FileOutputStream d = new FileOutputStream(desk);
			byte[] date = new byte[1024];
			int i = 0;
			while((i = c.read(date)) > 0) {
				d.write(date);
			}
			c.close();
			d.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
