package jdbc;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.junit.Test;

public class DBSelectAll {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(DBSelectAll.class);
	public static String DBSelectAl() {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		int i = 0;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			while (rs.next()) {
				 i = 1;
				System.out.println(rs.getString("idemployee") + " " + rs.getString("name") + " " + rs.getString("dob")
						+ " " + rs.getString("salary") + " " + rs.getString("age"));
			}
			if(i==1) {
				lg.info("All employees information displayed");
				return "Success";
			}

		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();
		}
		System.out.println("There are no employees in Data Base");
		return "Failure";
	}
	@Test
	public void testSelectAll() throws ClassNotFoundException {
		assertEquals("Success", DBSelectAl());
	}

}


