package chapter32a;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class load4 {
	public static void main(String[] args) {
		try(DataInputStream in=
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream("save4.txt")))){
		int n1=in.readInt();
		double n2=in.readDouble();
		
		System.out.println(n1);
		System.out.println(n2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
