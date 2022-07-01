package kb;

import java.util.Arrays;

public class page309 {
	public static void main(String[] args) {
		int n=4;
		int[][] arr=new int[n][n];
		int l=1;
		for(int i=0;i<arr.length;i++) {	
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=l;	l++;
				System.out.print(arr[i][j]+"\t");
			}
				System.out.println();
		}
		System.out.println();
		for(int i=n-1;i<arr.length;i++) {	
			for(int j=0;j<arr.length;j++) {
		//i가 3 1 2가 되야함
				System.out.print(arr[i][j]+"\t");
			}	System.out.println();
		}
		for(int i=0;i<arr.length-1;i++) {	
			for(int j=0;j<arr.length;j++) {
		//i가 3 1 2가 되야함
				System.out.print(arr[i][j]+"\t");
			}	System.out.println();
		
		}
	}
}
