package chapter05;
//문장의 구조와 이해
public class ifandelse1 {
	public static void main(String[] args) {
		int n=280; 
		
		if (n<0) {System.out.println("0미만");
		}else if(n<100) {System.out.println("0이상 100미만"); }
		else if(n<200){System.out.println("0이상 200미만"); }
		else if(n<300){System.out.println("0이상 300미만"); }
		
		else {System.out.println("0이상");
		}
		System.out.println("실행 끝");
		
		
	}
}










