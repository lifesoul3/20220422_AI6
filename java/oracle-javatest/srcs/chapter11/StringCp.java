package chapter11;
//substring concat-메소드 체이닝이 가능함 equals
public class StringCp {
public static void main(String[] args) {
	String str1="myhouse";
	String str2=new String("myhouse");
	//String==는 메모리 주소값 비교
	if(str1==str2)	System.out.println("same");
	else 	System.out.println("diff");
	//문자열 비교시 equals사용
	if(str1.equals(str2))	System.out.println("same");
	else	 System.out.println("diff");
}
}
