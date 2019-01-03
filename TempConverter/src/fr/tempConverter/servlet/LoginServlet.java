package fr.tempConverter.servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tempConverter.model.User;

import java.util.regex.*;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("loginServlet - do get");
		/*PrintWriter out = resp.getWriter();
		out.println("<Html><head><title>Garen</title></head><body><h1>SALUT MOI c'EST GAREN</h1></body></html>");
	*/
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("loginServlet - do post");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		System.out.println("email = " + email + "\nPassword = "+ pwd);
		Pattern pat = Pattern.compile("^*[@]{1}.*[.]{1}.");
		if(pat.matcher(email).find()) {
			System.out.println("true");
			req.getSession().setAttribute("user", new User(email,pwd));
			resp.sendRedirect("converter");
		}
		else {
			System.out.println("Mauvaise authentification");
			resp.sendRedirect("login");
		}
	}
	
	/*@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		System.out.println("loginServlet - service Methode");
	}*/
	
	

}
