package chapter23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//배열의 랜덤위치 1개씩 제거
public class col {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		Random r=new Random();
		list.add("aprat");
		list.add("ship");
		list.add("apple");
		list.add("sheep");
		list.add("toy");
		list.add("box");
		//6미만의 수만 출력
		int k=list.size();
		int n=0;int l=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<list.size();j++) {
				System.out.print(list.get(j)+"\t");
			}
			list.remove(r.nextInt(6+n));//랜덤이면서 0보다 커야함
			System.out.println();
			n--;
		}
		
	}
}
