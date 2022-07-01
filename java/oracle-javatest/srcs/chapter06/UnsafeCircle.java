package chapter06;

class UnsafeCircle {
	public static void main(String[] args) {
		circle c=new circle(1.5);
		System.out.println(c.getArea());
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		}
	
}