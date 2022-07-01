package baemin;

import java.util.Iterator;
import java.util.Scanner;
//if 및 else if를 통한 타클래스의 메소드 호출
public class Contr {
	Scanner s=new Scanner(System.in);
	Var v=new Var();
	View view=new View();
	File f=new File();
	
	public void run() {//전체 실행
		selectM();
		if(v.getOrderNum()==1) {
			selectC();
			selectF();
			view.viewDate();
			System.out.println(v.getCope()[v.getCopeNum()-1]
			+" "+v.getFoodName()+" "+v.getFoodCou()+"개 총 금액 : "
			+foodP(v.getFoodName())*v.getFoodCou()+"원");				
			view.thanks();
			String s=view.v.getNowDate()+" "+v.getCope()[v.getCopeNum()-1]
					+" "+v.getFoodName()+" "+v.getFoodCou()+"개 총 금액 : "
					+foodP(v.getFoodName())*v.getFoodCou()+"원"+"";
			f.loading();
			f.saving(s);			
		}
		else {
			selectCf();
		}
	}
	
	public void selectM() {//메뉴 선택
		
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
	
	public void selectCf() {//주문 내역 메뉴
		if (f.loading()==0) 
			System.out.println("[주문내역이 없습니다]");
		
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

	
	public void selectC() { //음식점 선택
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
	
	public void selectF()  {//식사 메뉴 선택
		s.nextLine();
		if(v.getCopeNum()==1) {			
			for(int i=0;i<1000;i++) {
				view.viewF1();
				view.viewFN();							
				System.out.println();				
				v.setFoodName(s.nextLine());				
				if(v.getFoodName().equals("비빔밥")|v.getFoodName().equals("된장찌개")|v.getFoodName().equals("불고기백반")) break;
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
				if(v.getFoodName().equals("짜장면")|v.getFoodName().equals("짬뽕")|v.getFoodName().equals("탕수육")) break;
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
				
				if(v.getFoodName().equals("스시")|v.getFoodName().equals("타코야키")|v.getFoodName().equals("규동")) break;
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
				
				if(v.getFoodName().equals("스테이크")|v.getFoodName().equals("파스타")|v.getFoodName().equals("필라프")) break;
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
				
				if(v.getFoodName().equals("아메리카노")|v.getFoodName().equals("카페라떼")|v.getFoodName().equals("오렌지주스")) break;
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
	public int foodP(String a) { //식사 가격 불러오기
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
