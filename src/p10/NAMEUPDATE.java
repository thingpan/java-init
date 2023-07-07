package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NAMEUPDATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ID:");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD:");
		String uiPwd = scan.nextLine();
		
		
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			int resultCnt=stmt.executeUpdate(sql);
			String sql ="UPDATE user_info";
			sql += "WHERE UI_ID ='"+ uiId +"' AND UI_PWD='"+uiPwd +"'";
			