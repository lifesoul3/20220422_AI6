package kb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class cal{
	jinggumdari b1;
	int n;
	int m;
	int l;
	int o;
	int p;
	int i;
	public cal(int n, int m, int l, int o, int p) {
		this.n = n;
		this.m = m;
		this.l = l;
		this.o = o;
		this.p = p;
		
	}
	public void cals() {
		i++;
		if(n!=m&&n!=l&&n!=o&&n!=p) {cal1();}
		
	}
	public void cal1() {
		
		if(m!=l&&m!=o&&m!=p) {cal2();}
	}
	public void cal2() {
		
		if(l!=o&&l!=p) {cal3();}
	}
	public void cal3() {
		if(o!=p) {check();}
	}
	public void check() {
		System.out.println(n+" "+m+" "+l+" "+o+" "+p+"\t"+i);
		
	}
}

public class jinggumdari {
	public static void main(String[] args) {
	List<Integer> listi=new ArrayList<Integer>();
	Random r=new Random();
	cal a1;
	int k;
	for(int i=0;i<100;i++) {
		listi.add(r.nextInt(5)+1);
		if(i%10==0)System.out.println();
		System.out.print(listi.get(i)+" ");
	}System.out.println();
//이배열에서5칸이내에 1~5가 모두 포함된 지역을 찾아라
	for(int i=4;i<96;i++) {
		a1=new cal(listi.get(i),listi.get(i+1),listi.get(i+2)
				,listi.get(i+3),listi.get(i+4));
		a1.cals();
		System.out.println(i);
	}
	
	
	
	
	}
}
