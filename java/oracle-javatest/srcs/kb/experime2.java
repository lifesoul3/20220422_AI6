package kb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import chapter23.ints;

//�־��� ����x��(3���̻� 50������)=1���� �迭 ������
//�迭������ ������ 1�̻� 1000������ �ڿ���
//�迭������ �����Ҵ� �ߺ�X
//�迭������ ���ڵ��� ���� ���ϱ��Ͽ� �Ҽ��� ���� ã��
public class experime2 {
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();//1���� �迭 ������
		Random r=new Random();
		for(int i=0;i<r.nextInt(4)+3;i++) {//�迭������ 3�̻� 7����
			arr.add(r.nextInt(9)+1);	//���ο��Ұ� 10���� 
			System.out.print(arr.get(i)+"\t");
		}
			System.out.println();
			System.out.println();
		int k; int l;
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<i;j++) {
				if(arr.get(i)==arr.get(j)) {
					arr.remove(i);i--;
				}
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+"\t");
		}
		
	}
	
}
