package chapter32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereader1 {
	public static void main(String[] args) {
		try(BufferedWriter bw=
				new BufferedWriter(new FileWriter("ex.txt"));
				){
			bw.write("�ȳ��ϼ���11");
			System.out.println("���Ͼ��� ����");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(BufferedReader br=
				new BufferedReader(new FileReader("ex.txt"));) {
		

			String str=(String)br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
