package practice2;

public class page317 {
	public static void main(String[] args) {
		int [][] a1=new int[3][3];
		int n=1;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<3;j++) {
				a1[i][j]=n;	n++;
				System.out.print(a1[i][j]+"\t");
			}System.out.println();
		}
		
	}
	
	
}
