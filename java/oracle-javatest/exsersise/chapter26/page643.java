package chapter26;

class outer{
	private static int num=0;
	static class nest1{
		void add(int n) {num+=n;}
	}
	static class nest2{
		int get() {return num;}
	}
}
public class page643 {
	public static void main(String[] args) {
		outer.nest1 nes1=new outer.nest1();
		outer.nest2 nes2=new outer.nest2();
		nes1.add(3);
		System.out.println(nes2.get());
	}
}
