package baemin;

import java.util.Iterator;
//�⺻����Ʈ�� �޼ҵ�ȭ �� hashmap key���� ���� �⺻�������� �� ����
public class View { 
	Var v=new Var();
	
	public void viewM() {
		System.out.println("=====����� ����=====");		
		System.out.println("1.�ֹ� 2.�ֹ� ����");
		System.out.println("==================");
		System.out.println("[�޴��� ������ �ּ���]");
		System.out.println();
	}
	
	public void viewC() {
		System.out.println("===================================");		
		System.out.println("1."+v.getCope()[0]+" "+"2."+v.getCope()[1]+" "+
				"3."+v.getCope()[2]+" "+"4."+v.getCope()[3]+" "+"5."+v.getCope()[4]);
		System.out.println("===================================");
		System.out.println("[�������� ������ �ּ���]");
		System.out.println();
	}
	
	public void viewF1() {
		System.out.println("===================================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="�����"|key=="�����"|key=="�Ұ����") {            	
            	System.out.print(key+":"+value+" ");
            }            
        }
		System.out.println();
		System.out.println("===================================");
	}
	
	public void viewF2() {
		System.out.println("==============================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="¥���"|key=="«��"|key=="������") {
            	System.out.print(key+":"+value+" ");
            }            
        }
		System.out.println();
		System.out.println("==============================");
	}
	
	public void viewF3() {
		System.out.println("=============================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="����"|key=="�Ե�"|key=="Ÿ�ھ�Ű") {
            	System.out.print(key+":"+value+" ");
            }            
        }
		System.out.println();
		System.out.println("=============================");
	}
	
	public void viewF4() {
		System.out.println("=================================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="�Ľ�Ÿ"|key=="������ũ"|key=="�ʶ���") {
            	System.out.print(key+":"+value+" ");
            }            
        }
		System.out.println();
		System.out.println("=================================");
	}
	
	public void viewF5() {
		System.out.println("======================================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="�Ƹ޸�ī��"|key=="ī���"|key=="�������ֽ�") {
            	System.out.print(key+":"+value+" ");
            }
        }
		System.out.println();
		System.out.println("======================================");
	}
	
	public void viewCou() {
		System.out.println("[������ �Է��� �ּ���]");
		
	}
	
	public void viewFN() {
		System.out.println("[�ֹ��Ͻ� ������ �Է��� �ּ���]");
	}
	
	public void viewR() {
		System.out.println();
		System.out.println("[�����Ͻ� ������ ��ȣ�� �����ϼ���]");
		System.out.println();
	}
	
	public void thanks() {
		System.out.println();
		System.out.println("�ֹ����ּż� �����մϴ�!");
	}
	
	public void viewDate() {
		v.setNowDate(v.dateC());
		System.out.println(v.getNowDate());
	}
	
	public void viewCM() {
		System.out.println("===================");		
		System.out.println("1.���� Ȯ�� 2.���� ����");
		System.out.println("===================");
		System.out.println("[�޴��� ������ �ּ���]");
		System.out.println();
	}
	
	public void viewAL1() {
		System.out.println();
		System.out.println("�Է� ��ȣ�� ��Ȯ���� �ʽ��ϴ�.");
		System.out.println("�ٽ� �Է��� ��Ź�帳�ϴ�.");
		System.out.println();
	}
	
	public void viewAL2() {
		System.out.println();
		System.out.println("�Է� ������ ��Ȯ���� �ʽ��ϴ�.");
		System.out.println("�ٽ� �Է��� ��Ź�帳�ϴ�.");
		System.out.println();
	}
	
	public void viewAL3() {
		System.out.println();
		System.out.println("�Է� �޴��� ��Ȯ���� �ʽ��ϴ�.");
		System.out.println("�ѱ۷� �Է��� ��Ź�帳�ϴ�.");
		System.out.println();
	}
	
	public void viewAL4() {
		System.out.println();
		System.out.println("��ȿ�� �����͹�ȣ�� �ƴմϴ�.");
		System.out.println("�ٽ� �Է��� ��Ź�帳�ϴ�.");
		System.out.println();
	}
}
