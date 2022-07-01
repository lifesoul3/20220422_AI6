package chapter05;
//처음만나는 5의 배수이자 7의 배수를 찾는 반복문
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
	else {System.out.println("없음");
	}
	System.out.println("끝");
	
}
}
