package chapter06;
//null키워드 자주사용함
public class BankD {
	public static void main(String[] args) {
	//메소드 매개번수로 인스받을때는 같은 인스를 공유함
	BankC kim=new BankC();
	BankC park=null;
	System.out.println(kim);
	System.out.println(park);
		
	
}
	public static void check(BankC ba2) {
		ba2.print();
		
		
		
	}
}