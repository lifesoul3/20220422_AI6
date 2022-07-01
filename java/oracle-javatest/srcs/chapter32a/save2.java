package chapter32a;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class save2 {
	public static void main(String[] args) throws IOException {
		OutputStream out=null;
		try {
			out=new FileOutputStream("data.dat");
			out.write(24);
		}
		finally {
			if(out!=null) {
				out.close();
			}
		}
	}
}
