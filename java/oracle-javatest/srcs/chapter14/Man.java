package chapter14;

public class Man {
	private String name;
	
	
	public Man() {
	}


	public Man(String name) {
		//자바의 모든 클래스는 object클래스를 상속하고있다.
		this.name = name;
		
	}


	public void tellName() {
		System.out.println("my name is "+name);
	}
	
}

