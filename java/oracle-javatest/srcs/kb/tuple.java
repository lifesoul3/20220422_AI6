package kb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//1 2 3 01 02 12 
//[2,1,3,4,1]	[2,3,4,5,6,7]
public class tuple {
	public static void main(String[] args) {
		Random r=new Random();
		List<Integer> base=new ArrayList<Integer>();
		List<Integer> answer=new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			base.add(r.nextInt(10)+1);
			System.out.print(base.get(i)+"  ");
		}System.out.println();
		for(int i=0;i<base.size();i++) {
			for(int j=i;j<base.size();j++) {
				if(i!=j) {answer.add(base.get(i)+base.get(j));}
			}
		}
		 List<Integer> newList =
				 answer.stream().distinct().collect(Collectors.toList());
		newList.sort(null);
		System.out.println("Ω√¿€");
		for(int i=0;i<newList.size();i++) {
			
			System.out.println(newList.get(i));
		}
		
		
	}
	
}
