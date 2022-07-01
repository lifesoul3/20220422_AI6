package chapter32a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//try with resource Àû¿ë
public class load3 {
	public static void main(String[] args) {
		try(InputStream in=new FileInputStream("save3.dat")){
			int dat=in.read();
			System.out.println(dat);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
