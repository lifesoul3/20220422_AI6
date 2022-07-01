package chapter32;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
public class iostream {
	public static void main(String[] args) throws IOException {
		OutputStream out=null;
		try {//파일을 만들거나 동일네임파일을 덮어씀
		out=new FileOutputStream("data.dat");//파일이름과 확장자
		out.write(4);

		}catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			if(out!=null) {
			out.close();
			}
		}
	}
}
