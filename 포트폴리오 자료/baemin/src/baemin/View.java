package baemin;

import java.util.Iterator;
//기본프린트의 메소드화 및 hashmap key값을 통한 기본데이터의 값 산출
public class View { 
	Var v=new Var();
	
	public void viewM() {
		System.out.println("=====배달의 민족=====");		
		System.out.println("1.주문 2.주문 내역");
		System.out.println("==================");
		System.out.println("[메뉴를 선택해 주세요]");
		System.out.println();
	}
	
	public void viewC() {
		System.out.println("===================================");		
		System.out.println("1."+v.getCope()[0]+" "+"2."+v.getCope()[1]+" "+
				"3."+v.getCope()[2]+" "+"4."+v.getCope()[3]+" "+"5."+v.getCope()[4]);
		System.out.println("===================================");
		System.out.println("[음식점을 선택해 주세요]");
		System.out.println();
	}
	
	public void viewF1() {
		System.out.println("===================================");
		v.setFood(v.menuCall());
		Iterator<String> keys = v.getFood().keySet().iterator();
		while( keys.hasNext() ){
            String key = keys.next();
            int value = v.getFood().get(key);
            if(key=="비빔밥"|key=="된장찌개"|key=="불고기백반") {            	
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
            if(key=="짜장면"|key=="짬뽕"|key=="탕수육") {
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
            if(key=="스시"|key=="규동"|key=="타코야키") {
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
            if(key=="파스타"|key=="스테이크"|key=="필라프") {
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
            if(key=="아메리카노"|key=="카페라떼"|key=="오렌지주스") {
            	System.out.print(key+":"+value+" ");
            }
        }
		System.out.println();
		System.out.println("======================================");
	}
	
	public void viewCou() {
		System.out.println("[수량을 입력해 주세요]");
		
	}
	
	public void viewFN() {
		System.out.println("[주문하실 음식을 입력해 주세요]");
	}
	
	public void viewR() {
		System.out.println();
		System.out.println("[삭제하실 데이터 번호를 선택하세요]");
		System.out.println();
	}
	
	public void thanks() {
		System.out.println();
		System.out.println("주문해주셔서 감사합니다!");
	}
	
	public void viewDate() {
		v.setNowDate(v.dateC());
		System.out.println(v.getNowDate());
	}
	
	public void viewCM() {
		System.out.println("===================");		
		System.out.println("1.내역 확인 2.내역 삭제");
		System.out.println("===================");
		System.out.println("[메뉴를 선택해 주세요]");
		System.out.println();
	}
	
	public void viewAL1() {
		System.out.println();
		System.out.println("입력 번호가 정확하지 않습니다.");
		System.out.println("다시 입력을 부탁드립니다.");
		System.out.println();
	}
	
	public void viewAL2() {
		System.out.println();
		System.out.println("입력 수량이 정확하지 않습니다.");
		System.out.println("다시 입력을 부탁드립니다.");
		System.out.println();
	}
	
	public void viewAL3() {
		System.out.println();
		System.out.println("입력 메뉴가 정확하지 않습니다.");
		System.out.println("한글로 입력을 부탁드립니다.");
		System.out.println();
	}
	
	public void viewAL4() {
		System.out.println();
		System.out.println("유효한 데이터번호가 아닙니다.");
		System.out.println("다시 입력을 부탁드립니다.");
		System.out.println();
	}
}
