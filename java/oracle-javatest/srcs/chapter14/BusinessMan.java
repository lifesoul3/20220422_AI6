package chapter14;

public class BusinessMan extends Man{
	private String company;
	private String position;
	
	public BusinessMan(String name,String company, String position) {
		super(name);//상위 클래스의 생성자 메소드를 호출
		this.company = company;
		this.position = position;
	}
	
	public void tellInfo() {
		tellName();
		System.out.println("my company is "+company);
		System.out.println("my position is "+position);
	}
	
	public void printCompany(String company) {
		System.out.println("my company is "+company);
	}
	
}
