package chapter16;

public class CAdder extends PAdder {
	
	//�żҵ��� �Ű������� �ٸ��� �������̵尡 �ƴ϶� �����ε����� ó����
	@Override
	public int add(int a, int b) {
		System.out.println("������ �����մϴ�.");
		return a+b;
	}
	
}
