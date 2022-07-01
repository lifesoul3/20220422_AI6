package kb;
class Solution233{
    public int solution(String s){
    	int answer = -1;
    	StringBuilder stbuf=new StringBuilder(s);
    try {
    	for(int i=0;i<stbuf.length();i++) {
    		if(stbuf.substring(i,i+1).equals(stbuf.substring(i+1,i+2)))
    		{stbuf.delete(i, i+2); i=-1;}
    		else {};
    	}
    	
    }catch(StringIndexOutOfBoundsException siob) {
    	if(stbuf.length()>0) {answer=0;}
    	else if(stbuf.length()==0) {answer=1;}
    	
    }System.out.println(answer);
    	return answer;
    }
}
public class Wkrwldj {
	public static void main(String[] args) {
		Solution233 sol= new Solution233();
		String s="baabaa";
		sol.solution(s);
	}
}
