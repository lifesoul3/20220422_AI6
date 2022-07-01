package chapter27;
interface cals<T>{
	T cal(T a,T b);
}
public class page672 {
	public static void main(String[] args) {
		cals<Integer> c1=(a,b)->a+b;
		System.out.println(c1.cal(2, 7));
	
	}
}
