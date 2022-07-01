package chapter26;

public class mulit {
	public static void main(String[] args) {
		Runnable task=()->{
			try {
			for(int i=0;i<20;i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread t=new Thread(task);
		t.start();
		
		
		
	}

}
