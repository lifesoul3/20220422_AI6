package chapter11;

public class myhome {
	//메소드 오버로딩 
	//구분가능 기준=1.매개변수의 데이터 타입 2.매개변수의 갯수
	public void plus(int n,int m) {
		System.out.println(n+m);
		}
	public void plus(double n,double m) {
		System.out.println(n+m);
		}
	public void plus(int n,int m,int l) {
		System.out.println(n+m+l);
		}
	public static void main(String[] args) {
		myhome a=new myhome();
		a.plus(3,2,4);
		
	}
}
