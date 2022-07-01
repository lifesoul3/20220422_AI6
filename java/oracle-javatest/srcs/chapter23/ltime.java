package chapter23;

import java.time.LocalDate;
import java.time.LocalTime;

public class ltime {
	public static void main(String[] args) {
		LocalTime now=LocalTime.now();
		System.out.println(now);
		LocalTime mt=now.plusHours(4);
		mt=mt.plusMinutes(10);
		System.out.println(mt);
		LocalTime mt1=now;
		mt1=mt1.plusHours(4);
		mt1=mt1.plusMinutes(10);
		System.out.println(mt1);
	}
}
