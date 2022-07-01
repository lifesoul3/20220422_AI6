package kb;
//13	17	43
class Solution134 {
    public int Solution(int left, int right) {

    	int answer = 0;
    	int length=right-left;

    	for(int j=0;j<=length;j++) {
    		int count=0;
    		for(int i=1;i<=left+j;i++) {
    		int k=left+j;
    		if(k%i==0) { count++; }
    		}
    	if(count%2==0) {answer+=(left+j);}
    	else answer-=(left+j);
    	}
    	System.out.println(answer);		
        return answer;
    }    
}
public class hashad {
	public static void main(String[] args) {
		Solution134 s= new Solution134();
		s.Solution(24, 27);
	}
}
