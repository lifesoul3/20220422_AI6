package practice2;
import java.util.Arrays;
//10개의 난수를 오름차순 정령
//제한 1시간
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
		int k;//오차값
		int y;//최소값
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
