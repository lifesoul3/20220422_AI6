package kb;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random r=new Random();
		int[] minwo=new int[6];
		int[] win=new int[6];
		
		for(int i=0;i<6;i++) {
			minwo[i]=r.nextInt(44)+1;
			win[i]=r.nextInt(44)+1;
			for(int j=0;j<i;j++) {
				if(minwo[i]==minwo[j]|win[i]==win[j]) i--;
			}
		}
		
		for(int i=0;i<6;i++) {
			minwo[r.nextInt(5)]=0;
			
		}
		for(int i=0;i<6;i++) {
			System.out.print(minwo[i]+" ");
		}
		System.out.print("\t");
		for(int i=0;i<6;i++) {
			System.out.print(win[i]+" ");
		}
		System.out.print("\t");
		int cnt=0;
		for(int i=0;i<6;i++) {
			for(int j=5;j>0;j--) {
				if(minwo[j]==win[i]) {cnt++;}
			}
		}
		System.out.println("최소"+cnt);
		int cnt2=0;
		for(int i=0;i<6;i++) {
			if(minwo[i]==0) cnt2++;
		}
		System.out.println("최대"+(cnt2+cnt));
	}
	
}
