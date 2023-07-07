package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con;
		try {
	        con =DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd","root","kd1824java");
			String sql="DELETE FROM USER_INFO WHERE UI_NUM=1";
			Statement stmt =con.createStatement();
			int resultCnt=stmt.executeUpdate(sql);
			System.out.println("삭제된 개수는 :"+resultCnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
