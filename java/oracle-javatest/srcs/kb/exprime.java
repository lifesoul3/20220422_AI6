package kb;
//�־��� ����x��(3���̻� 50������)=1���� �迭 ������
//�迭������ ������ 1�̻� 1000������ �ڿ���
//�迭������ �����Ҵ� �ߺ�X
//�迭������ ���ڵ��� ���� ���ϱ��Ͽ� �Ҽ��� ���� ã��

import java.util.Arrays;
import java.util.Random;

public class exprime {
	public static void main(String[] args) {
	Random r=new Random();
	int[] arr=new int[7];//�迭 ������ ���� ����
	int[] a=new int[r.nextInt(6)+1];//���� ���� ��迭

	for(int i=0;i<arr.length;i++) {
		arr[i]=r.nextInt(10)+1;
		for(int j=0;j<i;j++) {
		if(arr[i]==arr[j]) i--;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	int k=0;
	for(int i=0;i<7;i++) {
	
		
	}
	}
}
