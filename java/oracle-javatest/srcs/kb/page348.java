package kb;
class box{
	public box() {
	}

	@Override
	public String toString() {
		System.out.println("box");
		return "box []";
	}
	
}
class paper extends box{
	public paper(){
	}
	public String toString() {
		System.out.println("paper");
		return "box []";
	}
	
}
class gold extends paper{
	public gold() {
	}
	public String toString() {
		System.out.println("gold");
		return "box []";
	}
	
	
}
public class page348 {
	public static void main(String[] args) {
		box box1=new box();
		paper box2=new paper();
		gold box3=new gold();
		wrap(box1);
		wrap(box2);
		wrap(box3);
		box box4=new gold();
		wrap(box4);
	}
	public static void wrap(box box) {
		box.toString();
		
		
	}
}
