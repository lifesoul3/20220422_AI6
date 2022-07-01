package chapter26;

import java.util.concurrent.locks.ReentrantLock;

public class counter {
	int count=0;
	ReentrantLock r=new ReentrantLock();
	
	
	public void increase() {
		r.lock();
		count++;
		r.unlock();
		} 
	
	public void dcrease() {
		r.lock();
		count--;
		r.unlock();
	}
	
	public int get() {
		return count;
	}
}
