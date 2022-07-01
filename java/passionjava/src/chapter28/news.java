package chapter28;

import java.util.Random;

public class news {
	public static void main(String[] args) {
		a();
		
	}
	public static void a() {
		Random r=new Random();
		int[] ar=new int[10];
		for(int i=0;i<ar.length;i++) {
			ar[i]=r.nextInt(10)+1;
		}
		b(ar);
	}
	public static void b(int[] a) {
		int n=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					n++;
				}
			}
		}
		if(n>0) a();
		else c(a);
	}
	public static void c(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		d(a);
	}
	public static void d(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					System.out.println("same");
				}
			}
		}
	}
	
	}

