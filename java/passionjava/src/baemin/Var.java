package baemin;

import java.util.HashMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//�⺻�ڷ���� ����Ʈȭ �� ��������
public class Var {
	private String[] cope= {"�ѽ���","�߽���","�Ͻ���","�����","ī��"};
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
	//hashMap�� ���� �⺻�ڷ��� ����Ʈȭ
	public HashMap<String, Integer> menuCall(){
		HashMap<String, Integer> food=new HashMap<>();
		food.put("�����",6000);
		food.put("�����",6000);
		food.put("�Ұ����",8000);
		food.put("¥���",5000);
		food.put("«��",6000);
		food.put("������",12000);
		food.put("����",9000);
		food.put("�Ե�",8000);
		food.put("Ÿ�ھ�Ű",3000);
		food.put("�Ľ�Ÿ",7000);
		food.put("������ũ",16000);
		food.put("�ʶ���",8000);
		food.put("�Ƹ޸�ī��",3000);
		food.put("ī���",4000);
		food.put("�������ֽ�",5000);
		
		return food;
	}
	public String dateC() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("dd�� HH:mm:ss"));
		return formatedNow;
	}
}

