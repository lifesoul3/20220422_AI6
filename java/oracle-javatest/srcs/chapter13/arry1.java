package chapter13;

public class arry1 {

	public static void main(String[] args) {
		int[] ar1=new int[5];
	
		ar1[0]=7;
		ar1[1]=8;
		ar1[2]=9;
		ar1[3]=10;
		ar1[4]=7;
		//출력시 반복문 사용하면 편함
		for(int i=0;i<ar1.length;i++)
			{System.out.println(ar1[i]);}
	}

	
}
