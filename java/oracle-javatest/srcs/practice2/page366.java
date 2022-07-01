package practice2;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class page366 {
	public static void main(String[] args) {
		List<String> list= new LinkedList<>();
		list.add("aa");
		list.add("ab");
		list.add("ac");
		list.add("aa");
		String str="aa";

		for(String s:list) {
			if(str.equals("aa")) list.remove(s);
			System.out.println(s);
		}
		
	}
}
