package chapter23;

import java.time.LocalDate;

public class dateex {
	public static void main(String[] args) {
		//���� ��¥
		LocalDate today=LocalDate.now();
		System.out.println(today);
		//Ư�� ��
		String str="2022-12-25";
		LocalDate str1=LocalDate.of(2022, 12, 25);
		System.out.println(str1);
		System.out.println(today.getYear());
		LocalDate eve=str1.minusDays(1);
		System.out.println(eve);
		
		
		
		
		
		
	}
}
