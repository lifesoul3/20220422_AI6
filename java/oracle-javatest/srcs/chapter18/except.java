package chapter18;
//if(n==2) {	System.out.println("Ȯ��:1");
//System.out.println("����:2");
//n=sc.nextInt();
//if(n==1) {}//���� ��ȸ
//if(n==2) {}//���� ���û���


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class print{
	public void chooseC() {
		System.out.println("���Ը� �����Ͻʽÿ�");
		System.out.println("�ѽ���");
		System.out.println("�߽���");
		System.out.println("�Ͻ���");
		System.out.println("�����");
		System.out.println("ī��");
	}
	
	
	
	
}

//crud
//creat,read,update,delete
public class except {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			int m;
			System.out.println("�ֹ��� �Ͻðڽ��ϱ�:1");
			System.out.println("�ֹ������� ��ȸ�Ͻðڽ��ϱ�:2");
			n=sc.nextInt();
			print print=new print();
			if(n==1) {print.chooseC();n=sc.nextInt();
				if(n==1) {System.out.println("1");}
				
			}
			
		}										
}


