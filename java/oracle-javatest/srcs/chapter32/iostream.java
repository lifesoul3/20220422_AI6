package chapter32;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
public class iostream {
	public static void main(String[] args) throws IOException {
		OutputStream out=null;
		try {//������ ����ų� ���ϳ��������� ���
		out=new FileOutputStream("data.dat");//�����̸��� Ȯ����
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
