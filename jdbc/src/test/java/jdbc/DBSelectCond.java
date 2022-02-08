package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSelectCond {
	public static void DBSelectCon() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from employee where salary > 5000 and name like 'B%' and age > 21");
			System.out.println("\nThis is what we get with the conditional select");
			while (rs.next()) {
				System.out.println("\n" + rs.getString("idemployee") + " " + rs.getString("name") + " "
						+ rs.getString("dob") + " " + rs.getString("salary") + " " + rs.getString("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
