package chapter32a;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class load1 {
	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("datas1.dat");
		int dat=in.read();
		in.close();
		System.out.println(dat);
	}
}
