package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUpdate {
	public static void DBUpdat() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			String sql = "update employee " + "set salary = '1'" + "where idemployee = 1";
			stmt.executeUpdate(sql);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
