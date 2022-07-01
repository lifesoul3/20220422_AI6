package chapter12;

import java.util.Scanner;

public class readS {
	private Scanner sc=new Scanner(System.in);
	private String str1;
	private String str2;

	public void scanS() {
		System.out.println("문자열");
		String str1=sc.nextLine();
		System.out.println("문자열");
		String str2=sc.nextLine();
	}
	public void print() {
		System.out.println(str1);
		System.out.println(str2);
	}	
	public static void main(String[] args) {
		readS a=new readS();
		a.scanS();
	}
}


