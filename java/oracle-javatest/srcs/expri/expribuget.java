package expri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//������ 1000,�μ��� ������ 1�̻� 10�̸�->list�� ���̰� �μ��� ����
//�� �μ��� ��û�ݾ��� 1�̻� 100����->��list �� �ο��� ���μ��� ��û��
//������ 1000����
//2������ �ݷ��� ���� �ִ� ��� �μ��� ������ �����Ѱ�
public class expribuget {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Random r=new Random();
		int bud=r.nextInt(10000)+1;//���� ����
		int len=r.nextInt(100)+1;//�μ� ���� 10���� ����
		for(int i=0;i<len;i++) {
			list.add(r.nextInt(100)+1);
			System.out.print(list.get(i)+" ");//�� �μ��� ��û�� �Ҵ�
		}
		System.out.println();
		list.sort(null);
		int j=0; int cnt=0;
		for(int i=0;i<len;i++) {
			j+=list.get(i); 
			if(j>bud) {j-=list.get(i); break;}cnt++;
			
		}
		System.out.print("���� :"+bud+"\t");
		System.out.print("������ �ݾ� :"+j+"\t");
		System.out.println("�μ� ���� :"+cnt);
	}
	
}
