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
import org.apache.log4j.Logger;
import org.junit.Test;

public class DBDelete {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(DBDelete.class);
	public static String DBDelet() {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		try {
			BasicConfigurator.configure();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter name of employee you want to delete: ");
			String name = sc.nextLine();
			String sql = "delete from employee where name = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			int i = ps.executeUpdate();
			if (i != 0)
				lg.info("Employee " + name +" was deleted from MySql/demo/employee table");
				return "Success";

		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();

		}

		return "Failure";

	}

	@Test
	public void testDelete() throws ClassNotFoundException {
		assertEquals("Success", DBDelet());
	}

}
