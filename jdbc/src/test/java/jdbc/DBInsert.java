package jdbc;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.junit.Test;



public class DBInsert {
	private static final org.apache.log4j.Logger lg = LogManager.getLogger(DBInsert.class);
	
	public static String DBInser() throws ClassNotFoundException {
		BasicConfigurator.configure();
		lg.setLevel(Level.ALL);
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter the name of Employee you want to Insert: ");
			String name = sc.nextLine();
			System.out.println("Please Enter the Date of Birth of Employee you want to Insert: ");
			String dob = sc.nextLine();
			System.out.println("Please Enter the Salary of Employee you want to Insert: ");
			int salary = sc.nextInt();
			System.out.println("Please Enter the Age of Employee you want to Insert: ");
			int age = sc.nextInt();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "phenoix1");
			lg.info(conn + "---Succeful connection");
			String sql = "insert into employee " + " ( name, dob, salary, age)"
					+ " values ( ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, dob);
			ps.setInt(3, salary);
			ps.setInt(4, age);
			ps.executeUpdate();
			lg.info(name + " was inserted into table");
			System.out.println("Done");
			return "Success";
			
			
		} catch (Exception e) {
			lg.fatal("not able to aquire connection");
			e.printStackTrace();
			return "Failure";
		}
		
	}
	@Test
	public void testInsert() throws ClassNotFoundException {
		assertEquals("Success", DBInser());
	}

}
