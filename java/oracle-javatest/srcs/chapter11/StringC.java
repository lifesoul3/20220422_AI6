package chapter11;
//concat
public class StringC {
	
	public static void main(String[] args) {
		String st1="coffee";
		String st2="bread";
		String st4=st1+" "+st2;
		System.out.println(st4);
		String str3=st1.concat(st2);		
		System.out.println(str3);	
		String st5="fresh".concat(str3);
		System.out.println(st5);
	}

}
