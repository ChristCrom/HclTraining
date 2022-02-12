package com.hcl.website;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Verify() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = VerifyInfo(password, email);
		PrintWriter writer = response.getWriter();
		if (name != null) {
			writer.println("Hello " + name + "! You have succefully logged in!");
		} else
			writer.println("Email or password incorrect please try again");
	}

	public String VerifyInfo(String password, String email) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "phenoix1");
			String sql = "select name from exm where email = ? and password = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println("Succesful Login for: " + name);
				return name;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
