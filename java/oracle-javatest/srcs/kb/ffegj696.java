package kb;
abstract class person implements Comparable {
	private String name;
	private int age;
	public person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public int comto(Object o) {
		person p=(person)o;
		if (this.age>p.age)	return 1;
		else if(this.age<p.age) return-1;
		else return 0;
	}
	public String toString() {
		return name+ age;
	}
}
public class ffegj696 {
public static void main(String[] args) {
	System.out.println(3/2);
	System.out.println(2/2);
}
}
