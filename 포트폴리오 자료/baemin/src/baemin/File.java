package baemin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {//파일의 리스트화,삭제 및 저장
	List<String> list=new ArrayList<String>();	
	Var v=new Var();
	private String str;
	
	public int loading() {//기존 저장파일의 리스트화	
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
	
	public int remove(int m) {//리스트 삭제
		list.remove(m-1);
		System.out.println();
		System.out.println("[선택하신 ["+m+"]번 항목이 삭제되었습니다]");
		return m; 
	}
	
	public int check(int n) {//리스트 프린트
		//check(1)과check(2)를 구분하여 사용할것
		if (n==1)	{for(String s:list) {
			System.out.println(s);}}
		if (n==2)	{for(int i=0;i<list.size();i++) {
			System.out.println("["+(i+1)+"] "+list.get(i));}
		}	
		return n;
	}	

	public String saving(String ad) {//리스트의 파일화
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
