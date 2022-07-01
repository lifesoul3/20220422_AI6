package chapter23;

import java.time.LocalDate;
import java.time.Period;

public class period {
	public static void main(String[] args) {
		//d-day±¸ÇÏ±â
		LocalDate today=LocalDate.now();
		System.out.println(today);
		LocalDate xmas=LocalDate.of(2022, 12, 25);
		Period left=Period.between(today, xmas);
		System.out.println(left.getMonths()+left.getDays());
		
	}
}
