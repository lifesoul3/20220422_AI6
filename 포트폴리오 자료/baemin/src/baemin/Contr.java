package baemin;

import java.util.Iterator;
import java.util.Scanner;
//if �� else if�� ���� ŸŬ������ �޼ҵ� ȣ��
public class Contr {
	Scanner s=new Scanner(System.in);
	Var v=new Var();
	View view=new View();
	File f=new File();
	
	public void run() {//��ü ����
		selectM();
		if(v.getOrderNum()==1) {
			selectC();
			selectF();
			view.viewDate();
			System.out.println(v.getCope()[v.getCopeNum()-1]
			+" "+v.getFoodName()+" "+v.getFoodCou()+"�� �� �ݾ� : "
			+foodP(v.getFoodName())*v.getFoodCou()+"��");				
			view.thanks();
			String s=view.v.getNowDate()+" "+v.getCope()[v.getCopeNum()-1]
					+" "+v.getFoodName()+" "+v.getFoodCou()+"�� �� �ݾ� : "
					+foodP(v.getFoodName())*v.getFoodCou()+"��"+"";
			f.loading();
			f.saving(s);			
		}
		else {
			selectCf();
		}
	}
	
	public void selectM() {//�޴� ����
		
		for(int i=0;i<1000;i++) {
			view.viewM();			
			String A=s.nextLine();
			if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
				v.setOrderNum(Integer.parseInt(A));				
			}
			else {
				view.viewAL1();
				continue;
			}			
			if(v.getOrderNum()==1|v.getOrderNum()==2) break;
			else {
				view.viewAL1();
				continue;
			}
		}		
		System.out.println();
	}
	
	public void selectCf() {//�ֹ� ���� �޴�
		if (f.loading()==0) 
			System.out.println("[�ֹ������� �����ϴ�]");
		
		else {
		for(int i=0;i<1000;i++) {
			view.viewCM();
			String A=s.nextLine();
			if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
				v.setConfirmNum(Integer.parseInt(A));				
			}
			else {
				view.viewAL1();
				continue;
			}			
			if(v.getConfirmNum()==1|v.getConfirmNum()==2) break;
			else {
				view.viewAL1();
				continue;
			}
		}
		if(v.getConfirmNum()==1) {
			f.check(1);
		}
		else {
			f.check(2);
			for(int i=0;i<1000;i++) {
				view.viewR();
				String A=s.nextLine();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setRemoveNum(Integer.parseInt(A));				
				}
				else {
					view.viewAL1();
					continue;
				}				
				if(v.getRemoveNum()>0&&v.getRemoveNum()<=f.v.getListSize()) break;
				else {
					view.viewAL4();
					continue;
				}
			}
			f.remove(v.getRemoveNum());
			f.saving(null);
		}
		System.out.println();
		}
	}

	
	public void selectC() { //������ ����
		for(int i=0;i<1000;i++) {
			view.viewC();
			String A=s.next();
			if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
				v.setCopeNum(Integer.parseInt(A));				
			}
			else {
				view.viewAL1();
				continue;
			}			
			if(v.getCopeNum()==1|v.getCopeNum()==2|v.getCopeNum()==3|v.getCopeNum()==4|v.getCopeNum()==5) break;
			else {
				view.viewAL1();
				continue;
			}
		}		
		System.out.println();
	}
	
	public void selectF()  {//�Ļ� �޴� ����
		s.nextLine();
		if(v.getCopeNum()==1) {			
			for(int i=0;i<1000;i++) {
				view.viewF1();
				view.viewFN();							
				System.out.println();				
				v.setFoodName(s.nextLine());				
				if(v.getFoodName().equals("�����")|v.getFoodName().equals("�����")|v.getFoodName().equals("�Ұ����")) break;
				else {
					view.viewAL3();
					continue;
				}
			}
			for(int i=0;i<1000;i++) {
				System.out.println();
				view.viewCou();
				System.out.println();
				String A=s.next();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setFoodCou(Integer.parseInt(A));
					break;
				}
				else {
					view.viewAL2();
					continue;
				}
			}
			System.out.println();
		}
		else if(v.getCopeNum()==2) {
			for(int i=0;i<1000;i++) {
				view.viewF2();
				view.viewFN();							
				System.out.println();			
				v.setFoodName(s.nextLine());				
				if(v.getFoodName().equals("¥���")|v.getFoodName().equals("«��")|v.getFoodName().equals("������")) break;
				else {
					view.viewAL3();
					continue;
				}
			}			
			for(int i=0;i<1000;i++) {
				System.out.println();
				view.viewCou();
				System.out.println();
				String A=s.next();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setFoodCou(Integer.parseInt(A));
					break;
				}
				else {
					view.viewAL2();
					continue;
				}
			}
			System.out.println();
		}
		else if(v.getCopeNum()==3) {
			for(int i=0;i<1000;i++) {
				view.viewF3();
				view.viewFN();							
				System.out.println();			
				v.setFoodName(s.nextLine());
				
				if(v.getFoodName().equals("����")|v.getFoodName().equals("Ÿ�ھ�Ű")|v.getFoodName().equals("�Ե�")) break;
				else {
					view.viewAL3();
					continue;
				}
			}			
			for(int i=0;i<1000;i++) {
				System.out.println();
				view.viewCou();
				System.out.println();
				String A=s.next();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setFoodCou(Integer.parseInt(A));
					break;
				}
				else {
					view.viewAL2();
					continue;
				}
			}
			System.out.println();
		}
		else if(v.getCopeNum()==4) {
			for(int i=0;i<1000;i++) {
				view.viewF4();
				view.viewFN();							
				System.out.println();			
				v.setFoodName(s.nextLine());
				
				if(v.getFoodName().equals("������ũ")|v.getFoodName().equals("�Ľ�Ÿ")|v.getFoodName().equals("�ʶ���")) break;
				else {
					view.viewAL3();
					continue;
				}
			}			
			for(int i=0;i<1000;i++) {
				System.out.println();
				view.viewCou();
				System.out.println();
				String A=s.next();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setFoodCou(Integer.parseInt(A));
					break;
				}
				else {
					view.viewAL2();
					continue;
				}
			}
			System.out.println();
		}
		else {
			for(int i=0;i<1000;i++) {
				view.viewF5();
				view.viewFN();							
				System.out.println();			
				v.setFoodName(s.nextLine());
				
				if(v.getFoodName().equals("�Ƹ޸�ī��")|v.getFoodName().equals("ī���")|v.getFoodName().equals("�������ֽ�")) break;
				else {
					view.viewAL3();
					continue;
				}
			}
			for(int i=0;i<1000;i++) {
				System.out.println();
				view.viewCou();
				System.out.println();
				String A=s.next();
				if(A.matches("[+-]?\\d*(\\.\\d+)?")) {
					v.setFoodCou(Integer.parseInt(A));
					break;
				}
				else {
					view.viewAL2();
					continue;
				}
			}
			System.out.println();
		}
	}
	public int foodP(String a) { //�Ļ� ���� �ҷ�����
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key.equals(a)) {
            	v.setFoodPrice(value);
            }
        }
		return v.getFoodPrice();
	}
}
