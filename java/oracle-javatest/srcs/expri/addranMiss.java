package expri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//�迭������ ���ڵ��� ���� ���ϱ��Ͽ� �Ҽ��� ���� ã��
public class addranMiss {
	public void add(ArrayList<Integer> f) {
	
	Random r=new Random();
	List<Integer> list=f;
	Iterator<Integer> itr=list.iterator();

	//n=n+������ ��ġ���ִ¼�*����Ƚ��
	int n=0;
	
	for(int i=0;i<r.nextInt(6)+3;i++) {
		int q=0;
		q=r.nextInt(7-i);
		n=n+list.get(q);
		System.out.println(list.get(q));
		list.remove(q);
		
	}
	System.out.println(n);
	for(int i=2;i<n;i++) {
		if(n%i==0) {System.out.println("�Ҽ��ƴ�");break;}
		else if(i+1==n) System.out.println("�Ҽ�");
	}
	
	}
	}

