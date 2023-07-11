package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class BoardInsert {
		public List<Map<String,String>> getBoardInfoList() {
			List<Map<String, String>> list= new ArrayList<>();
			Connection con=DBCon.getCon();
			try {
				Statement stmt=con.createStatement();
				String sql ="INSERT INTO BOARD_INFO(BI_TITLE,BI_CONTENT	,BI_WRITER,BI_CREDAT,BI_CNT");
				ResultSet rs =stmt.executeUpdate(sql);
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return 0;
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
