package chapter12;
//���� ���
import java.util.Scanner;

public class sbug {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	
	
		//�����̽� �ٸ� ����Ѵٸ� n1���� n2�� �Ѿ
		//�����̽� �ٸ� ���� ����� ������ �ҿ�����
		//����Ű�� ���� ����Ű���� ���ڿ��� ��ȯ�Ǿ� ����Ű���� �Ҵ��� ���ο� ��ĳ�ʸ� �����ؾ���
		//next()�� ����Ͽ� ����Ű�� ���� but �Ѵܾ�� ����Ҽ�����-������ �������� ����
		//��Ȳ������ nextline+����Ű�� �޾��� nextline Ȥ�� next�� �����
		System.out.println("���� �Է� ");
		String n1=sc.nextLine();
	
		System.out.println("���� �Է� ");
		String n2=sc.nextLine();
	

		System.out.println(n1+" "+n2);
		System.out.println(n1+n2);
	}
}
