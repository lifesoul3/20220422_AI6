package chapter26;
class outer1{//클래스 내부에 클래스
	private static int num=0;
	static class nested1{
		void add(int n) {
			num+=n;
		}
	}
	static class nested2{
		int get() {
			return num;
		}
	}	
}

public class nested {
	public static void main(String[] args) {
		outer1.nested1 nst1=new outer1.nested1();
		nst1.add(5);
		outer1.nested2 nst2=new outer1.nested2();
		outer1 nst3=new outer1();
		
		System.out.println(nst2.get());
	}
}
