package practice1;
class Box{
	private String contents;
	private int boxNum;
	
	Box(int num,String cont){
		boxNum=num;
		contents=cont;
	}
	public int getBoxNum() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}


public class EnhancedForInst {
	public static void main(String[] args) {
		Box[] ar=new Box[5];
		ar[0]=new Box(101, "coffee");
		ar[1]=new Box(207, "apple");
		ar[2]=new Box(306, "car");
		ar[3]=new Box(404, "forest");
		ar[4]=new Box(103, "water");
	for(Box n: ar) {
		
			System.out.println(n);
	}
	System.out.println(ar[0]);
	}
}
