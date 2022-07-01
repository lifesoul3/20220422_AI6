package chapter05;
//1부터 시작해서 모든 홀수를 더한고 합이 1000이 넘을시 그수를 출력
//마지막으로 더해진 값을 구하시오
public class continuebasic {
	public static void main(String[] args) {
		int n=1,k=0;
		while(true) {
			if(k>1000) {break;}
			if(n%2!=0) {k+=n;}
			n++;}
			
			
	
		System.out.println(n-1);
		System.out.println(k);
	}
}
