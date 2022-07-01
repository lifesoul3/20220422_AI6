package chapter27;
interface calc{
	int cal(int n,int m);
}
public class page668 {
	public static void main(String[] args) {
		calc c=(a,b)-> a+b;
		System.out.println(c.cal(3, 6));
		
	}
}
