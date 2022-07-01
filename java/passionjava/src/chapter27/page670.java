package chapter27;

import java.util.Random;

interface generate{
	int gene();
}
public class page670 {
	public static void main(String[] args) {
		Random r=new Random();
		generate ge=()->{return r.nextInt(10);};
		System.out.println(ge.gene());
	}
}
