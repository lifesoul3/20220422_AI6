package chapter14;

public class Man {
	private String name;
	
	
	public Man() {
	}


	public Man(String name) {
		//�ڹ��� ��� Ŭ������ objectŬ������ ����ϰ��ִ�.
		this.name = name;
		
	}


	public void tellName() {
		System.out.println("my name is "+name);
	}
	
}

