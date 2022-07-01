package chapter32a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class save3 {
	public static void main(String[] args) {
		try(OutputStream out=new FileOutputStream("save3.dat")){
			out.write(77);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
