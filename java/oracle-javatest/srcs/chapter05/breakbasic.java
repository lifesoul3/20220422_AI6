package chapter05;
//ó�������� 5�� ������� 7�� ����� ã�� �ݺ���
public class breakbasic {
public static void main(String[] args) {
	int n=1;	
	boolean search=false;
	while(n<35)
		{if((n%5==0)&&(n%7==0)) { 
			search=true;
			
		break;
			
	}
	n++;
	}if(search) {System.out.println(n);}
	else {System.out.println("����");
	}
	System.out.println("��");
	
}
}
