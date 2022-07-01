package chapter23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		//<>-제네릭-저장할 데이터 타입!!
		//기본타입x 래퍼클래스사용
		ArrayList<Integer> intList=new ArrayList<>();
		ArrayList<String> strList=new ArrayList<>();
		//String[] arr=new String[1];-배열은 메모리가 고정임
		strList.add("toy");
		String box="box2";
		strList.add(box);
		strList.add(new String("robot"));
		strList.add("doll");
		strList.add("toy");
		
		for(String s:strList) {
		}
		Iterator<String> itr=strList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
}
