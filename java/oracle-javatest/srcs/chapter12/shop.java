package chapter12;

import java.util.Scanner;
//Scanner sc=new Scanner(System.in);
//1 사과=a 2바나나=b 3포도=f
//g=100원 구매할수없을시 잔액이 부족합니다.
//다른값 선택시 잘못된 선택입니다.
//특정값 선택시 상점 out 및 구매수량 표기


public class shop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int g=100;
		int a=10, b=13, f=22;

		for(int i=0;i<=100;i++) {
			int n=sc.nextInt();
			if(n==4)	{return;}
			else if(n>4) {System.out.println("잘못된 선택입니다");}
			else if(n==1) {if((g-a)<1) 
				{ System.out.println("잔액이 부족합니다");
				}
		
		
		
	}

}
	}
}
