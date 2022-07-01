package chapter15;

public class CakeOverriding {
	public static void main(String[] args) {
		CheeseCake c1=new CheeseCake();
		Cake c2=new Cake();	//사용가능 형태
		//CheeseCake c3=new Cake(); 사용불가능 형태
		Cake c3=new StrawberryCheeseCake();
		Cake[] cakearry=new Cake[4];
		
		cakearry[0]=c1;
		cakearry[1]=c2;
		cakearry[2]=c3;
		cakearry[3]=new BananaCake();
		
		//메소드 오버라이딩과 for문을 이용하여
		for(int i=0;i<cakearry.length;i++) {
			cakearry[i].yummy();
		}
	}
}
