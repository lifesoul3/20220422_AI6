package chapter32a;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class save1 {
	public static void main(String[] args) throws IOException {
		OutputStream out=new FileOutputStream("datas1.dat");
		out.write(7);
		out.close();
		
	}
}
