package chapter07001;
//변수 private 메소드 public 객체지향 어근
public class BankAccount {
	private String accNumber;

	private int balance;
	//생성자 메소드-클래스 이름과 동일,리턴없음

	
	//아래의 방식 getter setter
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber=accNumber;
	}
	
	public int deposit(int n) {
		balance+=n;
		return balance;
	}
	public int withdraw(int n) {
		balance-=n;
		return balance;
	}
	public int check() {
		System.out.println("계좌번호= "+accNumber);
		
		return balance;
	}
}
