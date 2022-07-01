package chapter11;

public class person {
	
	private int regi;
	private int pass;
	
	public person(int regi, int pass) {
		this.regi = regi;
		this.pass = pass;
	}
	public person(int regi) {
		this.regi = regi;
	}
	
	public void showinfo() {
		System.out.println("주민번호 "+regi);
		if(pass==0)
			System.out.println("여권없음");
		else 
			System.out.println("여권번호 "+pass);
		
	}
	public static void main(String[] args) {
		person p1=new person(201221,3315446);
		person p2=new person(200712);
		
		p1.showinfo();
		p2.showinfo();
	}
	
}
