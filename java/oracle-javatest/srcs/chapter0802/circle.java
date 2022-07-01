package chapter0802;

public class circle {
	double rad;
	final double PI;

	public circle(double r) {
		rad =r;
		PI=3.14;
	}
	public double getarea() {
		return (rad*2)*PI;
	}
}
