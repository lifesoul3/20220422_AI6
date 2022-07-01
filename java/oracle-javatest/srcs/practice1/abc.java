package practice1;

class BankAccount{
	int balance=0;
	
	int deposit(int n) {
		balance+=n;
		return balance;
	}
	int withdraw(int n) {
		balance-=n;
		return balance;
	}
	void check() {
		System.out.println("ภÜพื :"+balance);
	}
}

public class abc {
	public static void main(String[] args) {
		BankAccount ref=new BankAccount();
		ref.deposit(8000);
		ref.withdraw(3000);
		ref.check();
		print(ref);
		
	}
	static void print(BankAccount print) {
		print.check();
	}


}
