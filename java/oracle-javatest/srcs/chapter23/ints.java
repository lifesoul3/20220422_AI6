package chapter23;

import java.time.Duration;
import java.time.Instant;

public class ints {
	public static void main(String[] args) {
		Instant start=Instant.now();

		System.out.println(start.getEpochSecond());
		for(int i=0;i<100;i++) {
			i+=i;
		}
		Instant end=Instant.now();
		System.out.println(end.getEpochSecond());
		Duration bet=Duration.between(start, end);
		System.out.println(bet.toMillis());
	}
}
