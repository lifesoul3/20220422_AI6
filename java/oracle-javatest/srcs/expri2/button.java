package expri2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� �� �Դϴ�.
public class button {
	public static void main(String[] args) {
	int f0=0;
	int f1=1;
	//f2=1; f3=2; fn=??;;
	List<Integer> ar=new ArrayList<Integer>();
	Random r=new Random();
	int listsize=r.nextInt(20);
	ar.add(0);
	ar.add(1);
	System.out.println(ar.get(0));
	for(int i=2;i<listsize;i++) {
		
	}
	
		
		
	}
	
}
