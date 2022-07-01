package kb;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

//[6, 29, 2,28]	"629282"
class Solution7 {
    public String solution(int[] numbers) {
		int[][] arr=new int[numbers.length][2];

	    //int m=(int)(Math.log10(n));
		//가장큰수의 배열의 길이 파악
		int k=0;
		for(int i=0;i<numbers.length;i++) {
			int m=(int)Math.log10(numbers[i]);
			arr[i][0]=numbers[i];
			arr[i][1]=m;
			if(k<m) {k=m;}
		}
		//2 2 7 3 4
		//k=6
		for(int i=0;i<numbers.length;i++) {
			for(int j=(int)Math.log10(arr[i][0]);j<k;j++) {
				arr[i][0]=arr[i][0]*10;
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() {
		    public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                	 return o2[1] - o1[1];
		    	 }else {
		    		 return o2[0] - o1[0]; 
		    	 }
		    }
		});
//      String str1 = Integer.toString(intValue1);
		String str2="";
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i][1];j<k;j++) {
				arr[i][0]=arr[i][0]/10;
		
			}
			String str1=Integer.toString(arr[i][0]);
			str2+=str1;
			System.out.println(arr[i][0]);
		}
		String answer;
		answer=str2;
		System.out.println(str2);
		
        return answer;
    }
}

public class thebignum {
	public static void main(String[] args) {
		Solution7 sol=new Solution7();
		int[] ar=new int[] {3, 30, 34, 5, 9};


		sol.solution(ar);		
	}
}
