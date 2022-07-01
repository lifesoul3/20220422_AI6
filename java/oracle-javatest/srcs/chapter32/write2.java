package chapter32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class write2 {
	public static void main(String[] args) {
		//try with resource
		try(OutputStream out=new FileOutputStream("data2.dat")){
			out.write(15);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
