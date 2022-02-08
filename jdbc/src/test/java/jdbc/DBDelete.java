package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDelete {
	public static void DBDelet() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			String sql = "delete from employee where idemployee = 1";
			stmt.executeUpdate(sql);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
