package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectSal {
	public static void DBSelectSalary() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select salary from employee");
			while (rs.next()) {
				System.out.println(rs.getString("salary"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
