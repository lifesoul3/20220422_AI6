package chapter11;

public class myhome {
	//�޼ҵ� �����ε� 
	//���а��� ����=1.�Ű������� ������ Ÿ�� 2.�Ű������� ����
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
