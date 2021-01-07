package work10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test2 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String a = "F:\\test\\src.jpg";
		String b = "F:\\test\\desk.jpg";
		try {
			File src = new File(a);
			File desk = new File(b);
			desk.createNewFile();
			InputStream inputStream = new FileInputStream(src);
			DataInputStream c = new DataInputStream(inputStream);
			OutputStream outputStream = new FileOutputStream(desk);
			DataOutputStream d = new DataOutputStream(outputStream);
			
			byte[] date = new byte[(int)src.length()];
			c.read(date);
			d.write(date);
			d.flush();
			c.close();
			d.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
