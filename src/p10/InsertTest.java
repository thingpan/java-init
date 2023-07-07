package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		try {
			Connection	con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd","root","kd1824java");
			Statement stmt=con.createStatement();
			String sql="INSERT INTO user_info(UI_ID,UI_PWD,UI_NAME)\r\n"
					+ "VALUES('TEST3','TEST3','연습3')";
			int resultCnt=stmt.executeUpdate(sql);
			System.out.println("변형된 개수:"+resultCnt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
