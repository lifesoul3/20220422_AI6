package chapter15;

public class CakeOverriding {
	public static void main(String[] args) {
		CheeseCake c1=new CheeseCake();
		Cake c2=new Cake();	//��밡�� ����
		//CheeseCake c3=new Cake(); ���Ұ��� ����
		Cake c3=new StrawberryCheeseCake();
		Cake[] cakearry=new Cake[4];
		
		cakearry[0]=c1;
		cakearry[1]=c2;
		cakearry[2]=c3;
		cakearry[3]=new BananaCake();
		
		//�޼ҵ� �������̵��� for���� �̿��Ͽ�
		for(int i=0;i<cakearry.length;i++) {
			cakearry[i].yummy();
		}
	}
}
