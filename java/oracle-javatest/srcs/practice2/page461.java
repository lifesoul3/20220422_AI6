package practice2;
import java.util.Arrays;
//10���� ������ �������� ����
//���� 1�ð�
import java.util.Random;
import java.util.Scanner;

public class page461 {
	public static void main(String[] args) {
		Random r=new Random();
		int[] arr=new int[10];
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int z=s.nextInt();
		System.out.println("A :"+a);
		System.out.println("Z :"+z);
		arr[0]=a;
		arr[1]=z;
		int k;//������
		int y;//�ּҰ�
		if(a<z) {
			k=z-a;y=a;
		}
		else { 
			k=a-z;y=z;
		}
		for(int i=2;i<10;i++) {
			arr[i]=r.nextInt(k)+y;	
		}
		Arrays.sort(arr); 
		for(int n:arr) { 
			System.out.println(n);
		}
	}
}
