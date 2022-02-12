package jdbc;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.junit.Test;

public class DBUpdate {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(DBUpdate.class);
	public static String DBUpdat() {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter name of employee you want to update salary: ");
			String name = sc.nextLine();
			System.out.println("please enter new salary from employee");
			int sal = sc.nextInt();
			String sql = "update employee " + " set salary = ?" + " where name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sal);
			ps.setString(2, name);
			int i = ps.executeUpdate();
			if(i !=0) {
				lg.info("Salary was updated for " + name);
				System.out.println("Done");
				return "Success";
						}
			
			
			
		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();
		}
		lg.warn("Could not update salary for name given");
		return "Failure";

	}
	@Test
	public void testUpdate() throws ClassNotFoundException {
		assertEquals("Success", DBUpdat());
	}

}
