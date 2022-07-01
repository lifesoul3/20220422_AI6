package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import chapter13.array;

class Box<T>{
	private T ob;
	public Box(T o) {ob=o;}
	public T get() {
		System.out.println(ob);
		return ob;}
}


public class page743 {
	public static void main(String[] args) {
		List<Box<String>> ls=Arrays.asList(
				new Box<>("robot"),new Box<>("air"));
		int[] ar=new int[ls.size()];
		
		for(int i=0;i<ls.size();i++) {
			
		}
		
	}
}
