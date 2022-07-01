package chapter06;

public class circle {
	private double rad=0;
	
	final double PI=3.14;
	public circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
	if(r<0) { rad=0; return;}
	rad=r;
	}
	
	
	public double getArea() {
		return (rad*rad)*PI;
	}
}


