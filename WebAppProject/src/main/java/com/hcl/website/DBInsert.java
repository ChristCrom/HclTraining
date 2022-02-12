package com.hcl.website;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBInsert {
	public int DBInser(String name, String password, String email) throws ClassNotFoundException {
		int i = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "phenoix1");

			String sql = "insert into exm" + " (name, password, email)" + "values (?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, email);
			i = preparedStatement.executeUpdate();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
