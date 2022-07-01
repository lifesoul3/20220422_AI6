package kb;
class point{
	int x,y;
	public point(int n,int m) {
		x=n;
		y=m;
	}
	public void show() {
		System.out.println("좌표: "+x +" "+y );
	}
}
class circle{
	int n,m,k;
	public circle(int n,int m,int k) {
		this.n=n;
		this.m=m;
		this.k=k;
	point p=new point(n,m);
	p.show();	
	}
	public void showcircle() {
	
	System.out.println("반지름"+k/2*Math.PI);
	}
}
public class quaters1 {
	public static void main(String[] args) {
		circle c=new circle(2,2,4);
		c.showcircle();
	}
}
