package baemin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {//������ ����Ʈȭ,���� �� ����
	List<String> list=new ArrayList<String>();	
	Var v=new Var();
	private String str;
	
	public int loading() {//���� ���������� ����Ʈȭ	
		try(BufferedReader in=
				new BufferedReader(new FileReader("orderDB.txt"))){
			while(true) { 
				str=in.readLine();
				if(str==null) break;
				list.add(str);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		v.setListSize(list.size());
		return list.size();
	}
	
	public int remove(int m) {//����Ʈ ����
		list.remove(m-1);
		System.out.println();
		System.out.println("[�����Ͻ� ["+m+"]�� �׸��� �����Ǿ����ϴ�]");
		return m; 
	}
	
	public int check(int n) {//����Ʈ ����Ʈ
		//check(1)��check(2)�� �����Ͽ� ����Ұ�
		if (n==1)	{for(String s:list) {
			System.out.println(s);}}
		if (n==2)	{for(int i=0;i<list.size();i++) {
			System.out.println("["+(i+1)+"] "+list.get(i));}
		}	
		return n;
	}	

	public String saving(String ad) {//����Ʈ�� ����ȭ
		try(BufferedWriter write=
				new BufferedWriter(new FileWriter("orderDB.txt"))) {
			for(int i=0;i<list.size();i++) {
				write.write(list.get(i));
				write.newLine();
			}
		if(ad==null) {ad="";}
		write.write(ad);;		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return ad;
	}
}
