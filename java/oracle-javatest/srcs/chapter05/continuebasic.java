package chapter05;
//1���� �����ؼ� ��� Ȧ���� ���Ѱ� ���� 1000�� ������ �׼��� ���
//���������� ������ ���� ���Ͻÿ�
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
