package chapter32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class bytefiles {
	public static void main(String[] args) {
		try(InputStream in=new FileInputStream("data.dat");
				OutputStream out=new FileOutputStream("data3.dat"))
			{byte[] buf=new byte[1024];
			int data;
			while(true) {
				data=in.read(buf);
				if(data==-1) { break; }
				out.write(buf, 0, data);
				System.out.println(data);
			}
		}catch(IOException e) {
			e.getMessage();
		}
	}
}