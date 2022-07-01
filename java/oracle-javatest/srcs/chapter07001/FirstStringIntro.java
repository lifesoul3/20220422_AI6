package chapter07001;

public class FirstStringIntro {
	
	public static void main(String[] args) {
		String str1="Happy";
		String str2=new String("birthday");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+" "+str2);
		printstring(str1);
		printstring(" ");
		printstring(str2);
		printstring("\n");
		printstring("End of program! \n");
		printstring(new String("instance"));
		
		
		
	}
	public static void printstring(String str) {
		System.out.print(str);
	}
}
