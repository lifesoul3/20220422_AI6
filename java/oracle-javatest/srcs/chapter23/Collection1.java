package chapter23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
	public static void main(String[] args) {
		//<>-���׸�-������ ������ Ÿ��!!
		//�⺻Ÿ��x ����Ŭ�������
		ArrayList<Integer> intList=new ArrayList<>();
		ArrayList<String> strList=new ArrayList<>();
		//String[] arr=new String[1];-�迭�� �޸𸮰� ������
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
