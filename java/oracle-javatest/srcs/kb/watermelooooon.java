package kb;

import java.util.ArrayList;
import java.util.List;

class ok{
	public String soultion(int n) {
		String s="¼ö";
		String l="¹Ú";
		String an ="";
		for(int i=1;i<n+1;i++) {
		if(i%2!=0) {an=an+s;}	
		if(i%2==0) {an=an+l;}	
		}
		return an;
	}
}
public class watermelooooon {
	public static void main(String[] args) {
		ok ok=new ok();
		System.out.println(ok.soultion(11));
	}
}
