package chapter28;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
class jusort{
	public void sort(List<?> lists) {
		Collections.reverse(lists);
	}
}

public class page693 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,5,7,2,4,6);
		jusort js=new jusort();
		//Consumer<List<Integer>> c=e->js.sort(e);;
		Consumer<List<Integer>> c=js::sort;
		
		c.accept(list);
		System.out.println(list);
		
	}
}
