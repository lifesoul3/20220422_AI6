package chapter28;

import java.util.function.ToIntBiFunction;

class ibox{
	private int n;
	public ibox(int n) {
		this.n=n;
	}
	public int larger(ibox b) {
		if(n>b.n) {System.out.println("if"+n);return n;}
		else {System.out.println(); return b.n;}
	}
}
public class page700 {
	public static void main(String[] args) {
		ibox i1=new ibox(2);
		ibox i2=new ibox(3);
		ToIntBiFunction<ibox, ibox> bf=(n1,n2)->n1.larger(n2);
		int big=bf.applyAsInt(i1, i2);
		System.out.println(big);
	}
}
