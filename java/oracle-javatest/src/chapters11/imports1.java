package chapters11;
//db,�ڹ� ����� ������ ����Ʈ
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class dbs{
	public static Connection dbcons;
	public static Connection getConnection() {
		Connection cons=null;
		try {
			String user="projectdb";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cons=DriverManager.getConnection(url, user, pw);
			System.out.println("���� ����");
		}catch(ClassNotFoundException cnfe) {
			System.out.println("�ε�����");
		}catch(SQLException sqle) {
			System.out.println("���ӽ���");
		}catch(Exception e) {
			System.out.println("����");
		}
		return cons;
	}
}
class lists1{
	String s;
	String l;
	int n;
	int m;
	public lists1(String s, String l, int n, int m) {
		this.s = s;
		this.l = l;
		this.n = n;
		this.m = m;
	}
	@Override
	public String toString() {
		return "lists1 [s=" + s + ", l=" + l + ", n=" + n + ", m=" + m + "]";
	}
	
}

public class imports1 {
	public static void main(String[] args) {
		List<lists1> list=new ArrayList<lists1>();
		Connection cons=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		try {
			String quary="select * from buy";
			cons=dbs.getConnection();
			prst=cons.prepareStatement(quary);
			rs=prst.executeQuery();

			while(rs.next()) {
				String category=rs.getString(1);
				String name=rs.getString(2);
				int price=rs.getInt(3);
				int code=rs.getInt(4);
				list.add(new lists1(category,name,price,code));
			}
		}catch(SQLException sqle) {
				System.out.println("���� �߸���");
				sqle.printStackTrace();
		}
		
		for(lists1 s: list) 
			System.out.println(s.toString());
		
	}
}
	
	
	
	

