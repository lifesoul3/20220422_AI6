package chapter13;

public class Enhance {
	public static void main(String[] args) {
		//enhanced for�� foreach��� ��
		int[] ar1= {2,3,1,5,4};
		int sum=0;
		for (int n:ar1) {
		sum+=n;
		}
		System.out.println(sum);
	}
}
