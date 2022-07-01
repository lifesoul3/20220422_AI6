package kb;
//[4,7,12]	[true,false,true]	9
//[1,2,3]	[false,false,true]	0
class Solution12 {
    public int solution(int[] absolutes, boolean[] signs) {
    	int answer =0;
    	for(int i=0;i<absolutes.length;i++) {
    		if (signs[i]==false) {absolutes[i]=absolutes[i]*(-1);}
    		answer+=absolutes[i];
    	}
    	return answer;
    }
}
public class numbal {
	public static void main(String[] args) {
		Solution12 s=new Solution12();
		int[] ar=new int[] {1,2,3};
		boolean[] bo= new boolean[]{false,false,true};
		
		System.out.println(s.solution(ar, bo));
		
	}
}
