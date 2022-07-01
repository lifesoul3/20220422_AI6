package chapter06;
//return=값 반환,메소드의 종료.
public class method2param {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	public static int factorial(int n) {
		if (n==1) return 1;
			
		return n*factorial(n-1);
	}
}