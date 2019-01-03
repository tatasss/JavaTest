package fr.tempConverter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConverterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/convert.jsp").forward(req, resp);;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String celcius = req.getParameter("celcius");
		float celc = Float.parseFloat(celcius);
		float result = (float) ((celc*(9/5.0))+32);
		System.out.println("result = " +result);
		req.setAttribute("result",result );
		req.getRequestDispatcher("/WEB-INF/convert.jsp").forward(req, resp);
	}
}
