package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DBInsert {
	public static void DBInser() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			String sql = "insert into employee " + " (idemployee, name, dob, salary, age)"
					+ " values ('1', 'Christian Cromer', '11/24/1997', '26000', '24')";
			stmt.executeUpdate(sql);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
