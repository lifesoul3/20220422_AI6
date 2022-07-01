package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSearch {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("ship");
		list.add("toy");
		list.add("car");
		list.add("horse");
		
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
		}
		
		int id=Collections.binarySearch(list, "horse");
		System.out.println(id);
		System.out.println(list.get(id));
		
	}
}
