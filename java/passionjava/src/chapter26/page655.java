package chapter26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class page655 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("robot");
		list.add("apples");
		list.add("toy");
		Comparator<String> com=new Comparator<String>() {
			public int compare(String n1,String n2) {
				return n2.length()-n1.length();
			}
		};
		Collections.sort(list,com);
		for(String n:list) {
			System.out.println(n.toString());
		}
	}
}
