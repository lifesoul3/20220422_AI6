package kb;
//x=2 n=5
//�迭���ٰ� 2 4 6 8 10 ������
class Solution {
    public long[] solution(int x, int n) {
    	long[] ar=new long[n];
    	
    	for(int i=0;i<ar.length;i++) {
    		ar[i]=x*(i+1);
    	System.out.println(ar[i]);
    	}
    	
    	long[] answer = ar;
    
        
        return answer;
    }
}


public class XandN {
	public static void main(String[] args) {
		Solution s=new Solution();
		s.solution(-7, 11);
		
	}
	
}
