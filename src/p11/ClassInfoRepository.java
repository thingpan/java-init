package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class ClassInfoRepository {

	public List<Map<String,String>> getClassInfos(){
		List<Map<String,String>> classInfos = new ArrayList<>();
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt= con.createStatement();
			String sql = "SELECT * FROM CLASS_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> classInfo = new HashMap<>();
				classInfo.put("ciNum", rs.getString("CI_NUM"));
				classInfo.put("ciName", rs.getString("CI_NAME"));
				classInfo.put("ciDesc", rs.getString("CI_DESC"));
				classInfos.add(classInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return classInfos;
	}
}