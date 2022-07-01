package chapter26;
interface printable{
	public void print(String s);
	}
class samsung implements printable {
	@Override
	public void print(String s) {
		System.out.println(s);
		System.out.println("from samsung");
	}
}
class lg implements printable{
	@Override
	public void print(String s) {
		System.out.println(s);
		System.out.println("from lg");
	}
}

public class prints {
	public static void main(String[] args) {
		String s="start";
		printable prn1=new samsung();
		printable prn2=new lg();
		prn1.print(s);
		prn2.print(s);
	}
}






