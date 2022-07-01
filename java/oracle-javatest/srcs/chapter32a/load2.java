package chapter32a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class load2 {
	public static void main(String[] args) throws IOException {
		InputStream in=null;
		try {
			in=new FileInputStream("datas1.dat");
			int dat=in.read();
			System.out.println(dat);
		}
		finally {
			if(in!=null) in.close();
		}
	}
}
