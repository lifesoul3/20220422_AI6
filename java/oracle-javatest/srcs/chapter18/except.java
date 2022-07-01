package chapter18;
//if(n==2) {	System.out.println("확인:1");
//System.out.println("삭제:2");
//n=sc.nextInt();
//if(n==1) {}//내역 조회
//if(n==2) {}//내역 선택삭제


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class print{
	public void chooseC() {
		System.out.println("가게를 선택하십시오");
		System.out.println("한식집");
		System.out.println("중식집");
		System.out.println("일식집");
		System.out.println("양식집");
		System.out.println("카페");
	}
	
	
	
	
}

//crud
//creat,read,update,delete
public class except {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			int m;
			System.out.println("주문을 하시겠습니까:1");
			System.out.println("주문내역을 조회하시겠습니까:2");
			n=sc.nextInt();
			print print=new print();
			if(n==1) {print.chooseC();n=sc.nextInt();
				if(n==1) {System.out.println("1");}
				
			}
			
		}										
}


