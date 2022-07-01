package baemin;

import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//기본자료들의 리스트화 및 변수선언
public class Var {
	private String[] cope= {"한식점","중식점","일식점","양식점","카페"};
	private HashMap<String, Integer> food;
	private int orderNum;
	private int copeNum;
	private String foodName;
	private int foodCou;
	private int foodPrice;
	private String nowDate;
	private int confirmNum;
	private int removeNum;
	private int listSize;
		
	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public String[] getCope() {
		return cope;
	}

	public void setCope(String[] cope) {
		this.cope = cope;
	}

	public HashMap<String, Integer> getFood() {
		return food;
	}

	public void setFood(HashMap<String, Integer> food) {
		this.food = food;
	}

	public int getCopeNum() {
		return copeNum;
	}

	public void setCopeNum(int copeNum) {
		this.copeNum = copeNum;
	}	

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodCou() {
		return foodCou;
	}

	public void setFoodCou(int foodCou) {
		this.foodCou = foodCou;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getNowDate() {
		return nowDate;
	}

	public void setNowDate(String nowDate) {
		this.nowDate = nowDate;
	}

	public int getConfirmNum() {
		return confirmNum;
	}
	
	public void setConfirmNum(int confirmNum) {
		this.confirmNum = confirmNum;
	}

	public int getRemoveNum() {
		return removeNum;
	}

	public void setRemoveNum(int removeNum) {
		this.removeNum = removeNum;
	}
	//hashMap을 통한 기본자료의 리스트화
	public HashMap<String, Integer> menuCall(){
		HashMap<String, Integer> food=new HashMap<>();
		food.put("비빔밥",6000);
		food.put("된장찌개",6000);
		food.put("불고기백반",8000);
		food.put("짜장면",5000);
		food.put("짬뽕",6000);
		food.put("탕수육",12000);
		food.put("스시",9000);
		food.put("규동",8000);
		food.put("타코야키",3000);
		food.put("파스타",7000);
		food.put("스테이크",16000);
		food.put("필라프",8000);
		food.put("아메리카노",3000);
		food.put("카페라떼",4000);
		food.put("오렌지주스",5000);
		
		return food;
	}
	public String dateC() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("dd일 HH:mm:ss"));
		return formatedNow;
	}
}

