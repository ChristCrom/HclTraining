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

public class SelectSal {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(SelectSal.class);
	public static String DBSelectSalary() {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		int i = 0;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select salary from employee");
			while (rs.next()) {
				i=1;
				System.out.println(rs.getString("salary"));
			}
			if(i ==1) {
				lg.info("Salaries for all employees were displayed");
				return "Success";
			}
		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();
		}
		System.out.println("There are no employees to get salary for");
		return "Failure";
	}
	@Test
	public void testSelectSalary() throws ClassNotFoundException {
		assertEquals("Success", DBSelectSalary());
	}

}
