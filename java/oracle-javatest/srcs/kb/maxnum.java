package kb;

import java.util.ArrayList;
import java.util.List;

//1+, 2-, 3* 6������ ���
class cals12{
	
	String s;
	int n;
	public cals12(String s) {
		this.s=s;
		obs(s);
	}
	public void obs(String s1) {
	try {
	n=Integer.parseInt(s1);//�ڵ���ȯ��
	if ((n*0)==0) {s=null; System.out.println("�̰�n"+"\t"+n);}
	}catch(NumberFormatException e) {
	n=0;System.out.println("�̰� s"+"\t"+s);
	}
	}
}




//�ɰ��� ����Ʈȭ ���Ѻ���
public class maxnum {
	public static void main(String[] args) {
//		String s="100+200*30-24*30+4";//���̴� ������ ��������
//	List<cals12> s=new ArrayList<>(); 	
//	String s1="100+200*30-24*30+4";
//	System.out.println(s1.length());
	
//	for(int i=0;i<s1.length();i++) {
//		cals12 cal =new cals12(s1.substring(i,i+1));
//	}
	String n="2";
	String m="3";
	System.out.println(n+m);
	
	
	
	}
}
