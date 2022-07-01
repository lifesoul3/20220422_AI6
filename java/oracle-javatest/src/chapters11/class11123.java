package chapters11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class impor{
	public static Connection dbCoon;
	public static Connection getConnection() {
		Connection conn=null;
		try {
			
			String user="shop";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			conn=DriverManager.getConnection(url, user, pw);
		System.out.println("시스템 on");
		
		}
		catch(ClassNotFoundException cnf) {
			System.out.println("로딩실패");
		}
		catch(SQLException sqle) {
			System.out.println("접속실패");
		}
		catch(Exception e) {
			System.out.println("hi");
			e.printStackTrace();
		}
		return conn;
	}
}
class lists{
	String s;
	String n;
	String m;
	public lists(String s,String n,String m) {
		this.s=s;
		this.n=n;
		this.m=m;
	}
	@Override
	public String toString() {
		return "lists [s=" + s + ", n=" + n + ", m=" + m + "]";
	}
	
}
//	List<Integer> list=Arrays.asList(1,3,5,7,2,4,6);
public class class11123 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			String quary="select * from membertbl";
			conn=impor.getConnection();
			pstm=conn.prepareStatement(quary);
			rs=pstm.executeQuery();
		
			while(rs.next()) {
				String id=rs.getString(1);
				String name=rs.getString(2);
				String addr=rs.getString(3);
				System.out.println(id + name+ addr);
			}
		}
		catch(SQLException sqle) {
			System.out.println("잘못됨");
			sqle.printStackTrace();
		}finally{
			try{
			
			}catch(Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
			
	
	}
}
