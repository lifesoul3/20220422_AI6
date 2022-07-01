package practice;

public class ab {
static int balance=0;

	public static void main(String[] args) {
		deposit(12000);
		withdraw(8000);
		deposit(9000);
		withdraw(3000);
		check();

}
	public static int deposit(int amount) {
		balance+=amount;
		System.out.println("deposit"+balance);
		return balance;
	}
	public static int withdraw(int amount) {
		balance-=amount;
		System.out.println("withdraw"+balance);
		return balance;
	}
	public static int check() {
		System.out.println("ภÜพื"+balance);
		return balance;
	}
	
}
