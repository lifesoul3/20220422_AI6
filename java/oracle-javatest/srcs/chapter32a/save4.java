package chapter32a;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class save4 {
	public static void main(String[] args) {
		try(DataOutputStream out=
				new DataOutputStream(
						new BufferedOutputStream( 
								new FileOutputStream("save4.txt")))){
			out.writeInt(332);
			out.writeDouble(3.553);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
