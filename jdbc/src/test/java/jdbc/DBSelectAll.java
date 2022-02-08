package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSelectAll {
	public static void DBSelectAl() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getString("idemployee") + " " + rs.getString("name") + " " + rs.getString("dob")
						+ " " + rs.getString("salary") + " " + rs.getString("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
