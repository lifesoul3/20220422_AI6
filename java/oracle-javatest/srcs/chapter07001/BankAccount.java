package chapter07001;
//���� private �޼ҵ� public ��ü���� ���
public class BankAccount {
	private String accNumber;

	private int balance;
	//������ �޼ҵ�-Ŭ���� �̸��� ����,���Ͼ���

	
	//�Ʒ��� ��� getter setter
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
		System.out.println("���¹�ȣ= "+accNumber);
		
		return balance;
	}
}
