package chapter06;
//nullŰ���� ���ֻ����
public class BankD {
	public static void main(String[] args) {
	//�޼ҵ� �Ű������� �ν��������� ���� �ν��� ������
	BankC kim=new BankC();
	BankC park=null;
	System.out.println(kim);
	System.out.println(park);
		
	
}
	public static void check(BankC ba2) {
		ba2.print();
		
		
		
	}
}