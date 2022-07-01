package kb;
//주어진 값의 최소 공배수를 구해보자
//96 8 12--2 3
class lst{
	int n;
	int m;
	int i;
	public lst(int n, int m, int i) {
		this.n = n;
		this.m = m;
		this.i = i;
	}
	@Override
	public String toString() {
		return "lst [n=" + n + ", m=" + m + ", i=" + i + "]";
	}
	public void check() {
		System.out.println(i);
	}
	
	
}


public class overwork {
	public static void main(String[] args) {
		lst ls;
		int n=8;
		int m=12;
		//System.out.println(n/4);//8*9
		//System.out.println(m/4);//8*8
		for(int i=n;i>0;i--) {
		if(m%i==0) {
			if(n%i==0) {
			ls=new lst(n,m,i); ls.check(); break;}
		}
	}
}
}