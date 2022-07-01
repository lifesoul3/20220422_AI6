package expri;

import java.util.Arrays;
import java.util.Random;

public class ok {
	public static void main(String[] args) {
	Random r=new Random();
	int[][] arr=new int[10][2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<2;j++) {
			if(j==1) {arr[i][j]=r.nextInt(2);}
			else	{arr[i][j]=r.nextInt(20)+1;}
			System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		System.out.println();
		int n=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i][1]==0) {arr[i][0]=arr[i][0]*(-1);}
		n=n+arr[i][0];
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}System.out.println("\t"+n);
	
	
	}
}		

