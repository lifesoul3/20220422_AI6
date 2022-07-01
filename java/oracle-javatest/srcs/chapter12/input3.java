package chapter12;

import java.util.Scanner;

//持失切 五社球
public class input3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=0;
		for(int n=0;n<100;n++) {
			int k=sc.nextInt();
			l=l+k;
			System.out.println(l);
			
		}
		
	}
}