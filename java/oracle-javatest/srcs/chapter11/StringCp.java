package chapter11;
//substring concat-�޼ҵ� ü�̴��� ������ equals
public class StringCp {
public static void main(String[] args) {
	String str1="myhouse";
	String str2=new String("myhouse");
	//String==�� �޸� �ּҰ� ��
	if(str1==str2)	System.out.println("same");
	else 	System.out.println("diff");
	//���ڿ� �񱳽� equals���
	if(str1.equals(str2))	System.out.println("same");
	else	 System.out.println("diff");
}
}
