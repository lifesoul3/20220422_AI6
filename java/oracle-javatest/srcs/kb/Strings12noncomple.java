package kb;

import java.util.ArrayList;
import java.util.List;

//abc abc abc abc de de de de de de"	14
//abc���� = 4abcdededededede
//de����=abcabcabcabc6de;
class Solution9984 {//"abcabcabcabcdededededede"	14
    public int solution(String s) {
        int answer = 0;
        List<String> list=new ArrayList<String>();
        StringBuilder s1=new StringBuilder(s);
        int count=0;
        for(int i=1;i<s1.length();i++) {
        	String k;
        	try {if(s1.substring(0,i).equals(s1.substring(i, i*2))) {
        		s1.delete(i, i*2);
        		count++;
        		System.out.println(count+"  "+s1+"  "+i);
        		list.add((count+s1.toString()+i)); i--;}
        	else {s1=new StringBuilder(s);}
        }catch(StringIndexOutOfBoundsException sio) {
        }
        }
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        
        
        
        
        
        return answer;
    }
}
public class Strings12noncomple {
	public static void main(String[] args) {
		String s="abcabcabcabcdededededede";
		Solution9984 sol=new Solution9984();
		sol.solution(s);
	}
}
