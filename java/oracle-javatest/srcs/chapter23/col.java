package chapter23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//�迭�� ������ġ 1���� ����
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
		//6�̸��� ���� ���
		int k=list.size();
		int n=0;int l=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<list.size();j++) {
				System.out.print(list.get(j)+"\t");
			}
			list.remove(r.nextInt(6+n));//�����̸鼭 0���� Ŀ����
			System.out.println();
			n--;
		}
		
	}
}
