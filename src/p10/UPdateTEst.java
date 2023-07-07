package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UPdateTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd","root","kd1824java");
			Statement stmt=con.createStatement();
			String sql="UPDATE user_info\r\n"
					+ "SET UI_Name ='핑이'\r\n"
					+ "WHERE UI_NUM=12";
			int resultCnt=stmt.executeUpdate(sql);
			System.out.println("업데이트 수:"+resultCnt);
		}catch(Exception e) {
		e.printStackTrace();
	}

	}
}