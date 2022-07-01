package chapter26;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//page 882
public class acces {
	public static void main(String[] args) throws InterruptedException {
		counter cnt=new counter();
		Runnable task1=()->{
			for (int i=0;i<1000;i++) {
				cnt.increase();
			}
		};
		Runnable task2=()->{
			for (int i=0;i<1000;i++) {
				cnt.dcrease();
			}
		};
		ExecutorService exe=Executors.newFixedThreadPool(2);
		exe.submit(task1);
		exe.submit(task2);
		exe.shutdown();
		System.out.println(cnt.get());
		
	}
}
