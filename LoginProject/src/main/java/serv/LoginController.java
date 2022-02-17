package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



import Obj.User;


@WebServlet("/Login")

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		response.setContentType("text/html");

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		User client = new User();

		client.setUsername(username);

		client.setPassword(password);

		request.setAttribute("abc", client);

		if (client.validateUserNamePwd()) {

			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

			rd.forward(request, response);

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");

			rd.forward(request, response);

		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		doPost(request, response);

	}

}
