package jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.junit.Test;

public class DBSelectCond {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(DBSelectCond.class);
	public static String DBSelectCon() {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		int i = 0;
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from employee where salary > 5000 and name like 'B%' and age > 21");
			
			while (rs.next()) {
				 i = 1;
				System.out.println("\n" + rs.getString("idemployee") + " " + rs.getString("name") + " "
						+ rs.getString("dob") + " " + rs.getString("salary") + " " + rs.getString("age"));
			}
			if(i==1)
				lg.info("All employees that met criteria displayed");
				return "Success";
		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();
		}
		System.out.println("There are no employees that fit your condition!");
		return "Failure";
	}
	
	@Test
	public void testSelectCond() throws ClassNotFoundException {
		assertEquals("Success", DBSelectCon());
	}

}


