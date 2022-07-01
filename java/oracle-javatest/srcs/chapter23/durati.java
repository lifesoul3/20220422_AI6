package chapter23;

import java.time.Duration;
import java.time.LocalTime;

public class durati {
	public static void main(String[] args) {
		LocalTime now=LocalTime.now();
		LocalTime lun=LocalTime.of(12, 40);
		//duration
		Duration between=Duration.between(lun, now);
		System.out.println(between);
		
	}
}
