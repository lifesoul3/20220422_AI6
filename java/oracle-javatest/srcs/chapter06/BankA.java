package chapter06;

class BankC {
	int balance=0;
	public int deposit(int n) {
		balance+=n;
		return balance;
	}
	public int withdraw(int n) {
		balance-=n;
		return balance;
	}
	public void print() {
		System.out.println("ภÜพื= "+balance);
	}
}
class BankA {
	public static void main(String[] args) {
	BankC ref1=new BankC();
	BankC ref2=new BankC();
	ref1.deposit(1000);
	ref2.deposit(2000);
	ref1.print();
	
	
	
	
	}
}

