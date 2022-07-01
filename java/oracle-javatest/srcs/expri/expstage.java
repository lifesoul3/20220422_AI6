package expri;

import java.util.Random;

//[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//최대 수 지정
//각행열의 작은 값중 최대수 지정
//[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]] 133 19*7
public class expstage {
	public static void main(String[] args) {
		int[][] arr=new int[5][2];
		Random r=new Random();
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=r.nextInt(10)+1;
				System.out.print(arr[i][j]+" ");
			}System.out.print("\t");
		}
		int n=0;
		for(int i=0;i<5;i++) {
			if(arr[i][0]>arr[i][1]) {n=arr[i][0];
				arr[i][0]=0;}
			else arr[i][1]=0;
		}
		
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.print("\t");
		}
		
	}
}
